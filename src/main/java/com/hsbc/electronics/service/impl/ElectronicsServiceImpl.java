package com.hsbc.electronics.service.impl;

import com.hsbc.electronics.exception.ErrorCode;
import com.hsbc.electronics.model.ElectronicsMst;
import com.hsbc.electronics.repository.ElectronicsRepository;
import com.hsbc.electronics.service.ElectronicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service("electronicsService")
public class ElectronicsServiceImpl implements ElectronicsService {

    @Autowired
    private ElectronicsRepository electronicsRepository;

    @Autowired
    private MessageSource messageSource;

    @Override
    public ElectronicsMst create(ElectronicsMst electronicsMst) {
        if (Objects.nonNull(electronicsMst)) {
            return electronicsRepository.save(electronicsMst);
        } else {
            throw new EntityNotFoundException(messageSource.getMessage(ErrorCode.Electronics.ELECTRONICS_IS_EMPTY,
                    null, LocaleContextHolder.getLocale()));
        }
    }

    @Override
    public List<ElectronicsMst> getAll() {
        return electronicsRepository.getAll().orElseThrow(() -> new EntityNotFoundException(messageSource.getMessage(ErrorCode.Electronics.ELECTRONICS_LIST_NOT_FOUND,
                null, LocaleContextHolder.getLocale())));
    }

    public List<ElectronicsMst> fetchByCategory(String category){
        return electronicsRepository.fetchByCategory(category).orElseThrow(() -> new EntityNotFoundException(messageSource.getMessage(ErrorCode.Electronics.ELECTRONICS_LIST_NOT_FOUND,
                null, LocaleContextHolder.getLocale())));
    }

    public List<ElectronicsMst> fetchByCompany(String company){
        return electronicsRepository.fetchByCompany(company).orElseThrow(() -> new EntityNotFoundException(messageSource.getMessage(ErrorCode.Electronics.ELECTRONICS_LIST_NOT_FOUND,
                null, LocaleContextHolder.getLocale())));
    }

    public List<ElectronicsMst> getDiscountedProduct(String category){
        List<ElectronicsMst> electronicsMstList = electronicsRepository.fetchDiscountedProduct(category);
        List<ElectronicsMst> electronicsMstList1 = new ArrayList<>();
        if (Objects.nonNull(electronicsMstList)) {
            electronicsMstList.forEach(electronicsMst -> {
                if (electronicsMst.getDiscount() > 0) {
                    Double DiscountPrice =  (electronicsMst.getPrice() * electronicsMst.getDiscount()) / 100;
                    electronicsMst.setPrice(electronicsMst.getPrice() - DiscountPrice);
                    electronicsMstList1.add(electronicsMst);
                }
            });
            return electronicsMstList1;
        }
        else{
            throw new EntityNotFoundException(messageSource.getMessage(ErrorCode.Electronics.ELECTRONICS_IS_EMPTY,
                    null, LocaleContextHolder.getLocale()));
            }
    }
}