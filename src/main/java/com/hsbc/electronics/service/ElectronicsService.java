package com.hsbc.electronics.service;

import com.hsbc.electronics.model.ElectronicsMst;

import java.util.List;
import java.util.Map;

public interface ElectronicsService {
    List<ElectronicsMst> getAll();

    ElectronicsMst create(ElectronicsMst electronicsMst);

    List<ElectronicsMst> fetchByCategory(String category);

    List<ElectronicsMst> fetchByCompany(String company);

    List<ElectronicsMst> getDiscountedProduct(String category);

}
