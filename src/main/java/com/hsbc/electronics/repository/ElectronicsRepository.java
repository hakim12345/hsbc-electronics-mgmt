package com.hsbc.electronics.repository;

import com.hsbc.electronics.model.ElectronicsMst;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ElectronicsRepository extends JpaRepository<ElectronicsMst, Integer> {

    @Query("select c from ElectronicsMst c")
    Optional<List<ElectronicsMst>> getAll();

    @Query("select e from ElectronicsMst e where e.category= :category ORDER BY e.price ASC")
    Optional<List<ElectronicsMst>> fetchByCategory(String category);

    @Query("select e from ElectronicsMst e where e.company= :company ORDER BY e.price ASC")
    Optional<List<ElectronicsMst>> fetchByCompany(String company);

    @Query("select e from ElectronicsMst e where e.category= :category ORDER BY e.price ASC")
    List<ElectronicsMst> fetchDiscountedProduct(String category);

    @Query("select e from ElectronicsMst e where e.product= :product")
    ElectronicsMst fetchByProduct(String product);
}