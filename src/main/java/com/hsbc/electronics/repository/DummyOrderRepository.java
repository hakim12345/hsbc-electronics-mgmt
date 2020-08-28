package com.hsbc.electronics.repository;

import com.hsbc.electronics.model.DummyProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyOrderRepository extends JpaRepository<DummyProductOrder, Integer> {

}
