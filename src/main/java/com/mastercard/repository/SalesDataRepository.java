package com.mastercard.repository;

import com.mastercard.entity.SalesData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesDataRepository extends JpaRepository<SalesData,Integer> {
}
