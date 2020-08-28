package com.hsbc.electronics.controller;

import com.hsbc.electronics.constants.UrlConstants;
import com.hsbc.electronics.exception.Constants;
import com.hsbc.electronics.model.ElectronicsMst;
import com.hsbc.electronics.model.pojo.ElectronicsMstDTO;
import com.hsbc.electronics.service.ElectronicsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ElectronicsDeviceController extends BaseController{

    @Autowired
    private ElectronicsService electronicsService;

    @ApiOperation("Create Electronics")
    @PostMapping( value = UrlConstants.ELECTRONICS_CREATE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity< Map<String, Object>> create(@RequestBody final ElectronicsMstDTO electronicsMstDTO){
        ElectronicsMst electronicsMst = convertToEntity(electronicsMstDTO);

        Map<String, Object> response =new HashMap<>();
        ElectronicsMst electronicsMst1 = electronicsService.create(electronicsMst);
        response.put(Constants.TDATA, electronicsMst1);
        addSuccess(response, Constants.CREATE);
        return ResponseEntity.ok(response);
    }

    @ApiOperation("Get List of products")
    @GetMapping(value = UrlConstants.PRODUCTS_LIST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getAll(){

        Map<String, Object> response =new HashMap<>();
        List<ElectronicsMst> products = electronicsService.getAll();
        response.put(Constants.TDATA, products);
        addSuccess(response, Constants.GET);
        return ResponseEntity.ok(response);
    }


    @ApiOperation("Get the product by category")
   @GetMapping(value = UrlConstants.PRODUCTS_BY_CATEGORY, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<Map<String, Object>> fetchByCompany(@RequestParam String company){
        Map<String, Object> response =new HashMap<>();
        List<ElectronicsMst> electronicsByCompany = electronicsService.fetchByCompany(company);
       response.put(Constants.TDATA, electronicsByCompany);
        addSuccess(response, Constants.GET);
        return ResponseEntity.ok(response);
    }

    @ApiOperation("Get the product by category")
    @GetMapping(value = UrlConstants.PRODUCTS_BY_COMPANY, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> fetchByCategory(@RequestParam String category){
        Map<String, Object> response =new HashMap<>();
        List<ElectronicsMst> electronicsByCategory = electronicsService.fetchByCategory(category);
        response.put(Constants.TDATA, electronicsByCategory);
        addSuccess(response, Constants.GET);
        return ResponseEntity.ok(response);
    }

    @ApiOperation("Get List of products to discount")
    @GetMapping(value = UrlConstants.PRODUCTS_DISCOUNTED_PRICE_LIST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getDiscountedPrice(@RequestParam String category){

        Map<String, Object> response =new HashMap<>();
        List<ElectronicsMst> products = electronicsService.getDiscountedProduct(category);
        response.put(Constants.TDATA, products);
        addSuccess(response, Constants.GET);
        return ResponseEntity.ok(response);
    }

    private ElectronicsMst convertToEntity(ElectronicsMstDTO electronicsMstDTO){
        return modelMapper().map(electronicsMstDTO, ElectronicsMst.class);
    }
}
