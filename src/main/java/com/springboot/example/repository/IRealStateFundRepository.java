package com.springboot.example.repository;

import com.springboot.example.model.entity.RealStateFund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IRealStateFundRepository extends JpaRepository<RealStateFund, Long> {

}
