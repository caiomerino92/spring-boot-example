package com.springboot.example.service;

import com.springboot.example.model.entity.RealStateFund;
import com.springboot.example.model.request.RealStateFundRequest;
import com.springboot.example.model.response.RealStateFundResponse;
import com.springboot.example.parser.RealStateFundParser;
import com.springboot.example.repository.IRealStateFundRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RealStateFundService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RealStateFundService.class);

    private final IRealStateFundRepository realStateFundRepository;

    @Autowired
    public RealStateFundService(IRealStateFundRepository realStateFundRepository) {
        this.realStateFundRepository = realStateFundRepository;
    }

    public RealStateFundResponse save(RealStateFundRequest realStateFundRequest) {
        LOGGER.debug("RealStateFundService.save ticket name = {}", realStateFundRequest.getTicketName());

        RealStateFund realStateFund = RealStateFundParser.parse(realStateFundRequest);
        return RealStateFundParser.parse(realStateFundRepository.save(realStateFund));
    }

    public RealStateFundResponse findById(Long id) throws Exception {
        LOGGER.debug("RealStateFundService.findById id={}", id);

        return RealStateFundParser.parse(realStateFundRepository.findById(id).orElseThrow(
                () -> new Exception("RealStateFund not found with id " + id)));
    }

    public List<RealStateFundResponse> findAll() {
        LOGGER.debug("RealStateFundService.findAll");

        return realStateFundRepository.findAll()
                .stream()
                .map(RealStateFundParser::parse)
                .collect(Collectors.toList());
    }

    public void deleteById(Long id) throws Exception {
        LOGGER.debug("RealStateFundService.deleteById id={}", id);

        realStateFundRepository.deleteById(id);
    }

    public RealStateFundResponse update(Long id, RealStateFundRequest realStateFundRequest) throws Exception {
        LOGGER.debug("RealStateFundService.update id={}", id);

        Optional<RealStateFund> realStateFundFounded =  realStateFundRepository.findById(id);

        if (realStateFundFounded.isPresent()) {
            RealStateFund realStateFund = RealStateFundParser.parse(realStateFundRequest);
            return RealStateFundParser.parse(realStateFundRepository.save(realStateFund));
        } else {
            throw new Exception("RealStateFund not found with id " + id);
        }
    }

    public void deleteAll() {
        LOGGER.debug("RealStateFundService.deleteAll");

        realStateFundRepository.deleteAll();
    }
}
