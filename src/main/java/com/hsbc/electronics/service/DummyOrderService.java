package com.hsbc.electronics.service;

import com.hsbc.electronics.model.DummyProductOrder;

import java.util.Map;

public interface DummyOrderService {

    DummyProductOrder createOrder(DummyProductOrder dummyProductOrder);

    Map<String, String> deleteDummyOrder(Integer id);

}
