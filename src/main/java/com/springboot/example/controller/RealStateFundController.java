package com.springboot.example.controller;

import com.springboot.example.model.request.RealStateFundRequest;
import com.springboot.example.model.response.RealStateFundResponse;
import com.springboot.example.service.RealStateFundService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/realStateFunds")
public class RealStateFundController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RealStateFundController.class);

    private final RealStateFundService realStateFundService;

    @Autowired
    public RealStateFundController(RealStateFundService realStateFundService) {
        this.realStateFundService = realStateFundService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody RealStateFundRequest realStateFundRequest) {
        LOGGER.debug("RealStateFundController.save ticket name = {}", realStateFundRequest.getTicketName());

        RealStateFundResponse response = realStateFundService.save(realStateFundRequest);

        LOGGER.debug("RealStateFundController.save request id = {}", response.getId());
    }

    @GetMapping("/{id}")
    public RealStateFundResponse findById(@PathVariable Long id) {
        LOGGER.debug("RealStateFundController.findById id={}", id);

        try {
            return realStateFundService.findById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Real State Funds not found.", e);
        }
    }

    @GetMapping
    public List<RealStateFundResponse> findAll() {
        LOGGER.debug("RealStateFundController.findAll");

        return realStateFundService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        LOGGER.debug("RealStateFundController.deleteById id={}", id);

        try {
            realStateFundService.deleteById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Real State Funds not found.", e);
        }
    }

    @PutMapping
    public RealStateFundResponse update(@PathVariable Long id, @RequestBody RealStateFundRequest realStateFundRequest) {
        LOGGER.debug("RealStateFundController.update id={}", id);

        try {
            return realStateFundService.update(id, realStateFundRequest);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Real State Funds not found.", e);
        }
    }

    @PatchMapping
    public RealStateFundResponse update(@RequestBody RealStateFundRequest realStateFundRequest) {
        LOGGER.debug("RealStateFundController.update partial");

        return realStateFundService.save(realStateFundRequest);
    }

    @DeleteMapping
    public void deleteAll() {
        LOGGER.debug("RealStateFundController.deleteAll");

        realStateFundService.deleteAll();
    }
}
