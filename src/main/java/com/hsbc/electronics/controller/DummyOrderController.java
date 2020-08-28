package com.hsbc.electronics.controller;


import com.hsbc.electronics.constants.UrlConstants;
import com.hsbc.electronics.exception.Constants;
import com.hsbc.electronics.model.DummyProductOrder;
import com.hsbc.electronics.model.pojo.DummyProductOrderDTO;
import com.hsbc.electronics.service.DummyOrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DummyOrderController extends BaseController{

    @Autowired
    private DummyOrderService dummyOrderService;

    @ApiOperation("Create Electronics")
    @PostMapping( value = UrlConstants.DUMMY_ORDER_CREATE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> create(@RequestBody final DummyProductOrderDTO dummyProductOrderDTO){
        DummyProductOrder dummyProductOrder = convertToEntity(dummyProductOrderDTO);

        Map<String, Object> response =new HashMap<>();
        DummyProductOrder dummyProductOrder1 = dummyOrderService.createOrder(dummyProductOrder);
        response.put(Constants.TDATA, dummyProductOrder1);
        addSuccess(response, Constants.CREATE);
        return ResponseEntity.ok(response);
    }

    @ApiOperation("delete Vehicle")
    @DeleteMapping(value = UrlConstants.DELETE_DUMMY_ORDER, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> deleteDummyOrder(@RequestParam("id") final Integer id){

        Map<String, Object> response =new HashMap<>();
        Map<String, String> message = dummyOrderService.deleteDummyOrder(id);
        response.put("message", message);
        addSuccess(response, Constants.DELETE);
        return ResponseEntity.ok(response);
    }

    private DummyProductOrder convertToEntity(DummyProductOrderDTO dummyProductOrderDTO){
        return modelMapper().map(dummyProductOrderDTO, DummyProductOrder.class);
    }
}
