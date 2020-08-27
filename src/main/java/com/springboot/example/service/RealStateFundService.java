package com.springboot.example.service;

import com.springboot.example.model.entity.RealStateFund;
import com.springboot.example.model.request.RealStateFundRequest;
import com.springboot.example.model.response.RealStateFundResponse;
import com.springboot.example.parser.RealStateFundParser;
import com.springboot.example.repository.IRealStateFundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RealStateFundService {

    private final IRealStateFundRepository realStateFundRepository;

    @Autowired
    public RealStateFundService(IRealStateFundRepository realStateFundRepository) {
        this.realStateFundRepository = realStateFundRepository;
    }

    public RealStateFundResponse save(RealStateFundRequest realStateFundRequest) {

        RealStateFund realStateFund = RealStateFundParser.parse(realStateFundRequest);
        return RealStateFundParser.parse(realStateFundRepository.save(realStateFund));
    }

    public RealStateFundResponse findById(Long id) throws Exception {

        return RealStateFundParser.parse(realStateFundRepository.findById(id).orElseThrow(
                () -> new Exception("RealStateFund not found with id " + id)));
    }

    public List<RealStateFundResponse> findAll() {

        return realStateFundRepository.findAll()
                .stream()
                .map(RealStateFundParser::parse)
                .collect(Collectors.toList());
    }
}
