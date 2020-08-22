package com.springboot.example.repository;

import com.springboot.example.entity.RealStateFund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RealStateFundRepository extends JpaRepository<RealStateFund, Long> {
}
