package com.springboot.example.controller;

import com.springboot.example.model.request.RealStateFundRequest;
import com.springboot.example.model.response.RealStateFundResponse;
import com.springboot.example.service.RealStateFundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/realStateFunds")
public class RealStateFundController {

    private final RealStateFundService realStateFundService;

    @Autowired
    public RealStateFundController(RealStateFundService realStateFundService) {
        this.realStateFundService = realStateFundService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody RealStateFundRequest realStateFundRequest) {
        realStateFundService.save(realStateFundRequest);
    }

    @GetMapping("/{id}")
    public RealStateFundResponse findById(@PathVariable Long id) {
        try {
            return realStateFundService.findById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Real State Funds not found.", e);
        }
    }

    @GetMapping
    public List<RealStateFundResponse> findAll() {
        return realStateFundService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        try {
            realStateFundService.deleteById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Real State Funds not found.", e);
        }
    }

    @PutMapping
    public RealStateFundResponse update(@PathVariable Long id, @RequestBody RealStateFundRequest realStateFundRequest) {
        try {
            return realStateFundService.save(realStateFundRequest);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Real State Funds not found.", e);
        }
    }

    @DeleteMapping
    public void deleteAll() {
        realStateFundService.deleteAll();
    }
}
