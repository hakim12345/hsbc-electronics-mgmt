package com.hsbc.electronics.service.impl;

import com.hsbc.electronics.exception.ErrorCode;
import com.hsbc.electronics.model.DummyProductOrder;
import com.hsbc.electronics.model.ElectronicsMst;
import com.hsbc.electronics.repository.DummyOrderRepository;
import com.hsbc.electronics.repository.ElectronicsRepository;
import com.hsbc.electronics.service.DummyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service("dummyOrderService")
public class DummyOrderServiceImpl implements DummyOrderService {

    @Autowired
    private DummyOrderRepository dummyOrderRepository;

    @Autowired
    private ElectronicsRepository electronicsRepository;

    @Autowired
    private MessageSource messageSource;

    public DummyProductOrder createOrder(DummyProductOrder dummyProductOrder) {

        if (Objects.nonNull(dummyProductOrder)) {
            ElectronicsMst electronicsMst = electronicsRepository.fetchByProduct(dummyProductOrder.getProduct());
            if(electronicsMst.getItemsInStock() > dummyProductOrder.getNumberOfOrder()){
                dummyProductOrder.setOrderStatus(true);
                electronicsMst.setItemsInStock((electronicsMst.getItemsInStock()-dummyProductOrder.getNumberOfOrder()));
                electronicsRepository.save(electronicsMst);
                return dummyOrderRepository.save(dummyProductOrder);
            }
            else{
                return null;
            }

        } else {
            throw new EntityNotFoundException(messageSource.getMessage(ErrorCode.Electronics.DUMMY_ORDER_IS_EMPTY,
                    null, LocaleContextHolder.getLocale()));
        }
    }


   public Map<String, String> deleteDummyOrder(Integer id){
       Map<String, String> result = new HashMap<>();
       DummyProductOrder dummyProductOrder = dummyOrderRepository.getOne(id);
       if (dummyProductOrder.getOrderStatus().equals(true)) {
           dummyProductOrder.setOrderStatus(false);
           dummyOrderRepository.save(dummyProductOrder);
           result.put("delete", "Vehicle having delete successfully");
           return result;
       } else {
           throw new EntityNotFoundException(messageSource.getMessage(ErrorCode.Electronics.DUMMY_ORDER_DELETE,
                   null, LocaleContextHolder.getLocale()));
       }
    }
}
