package com.mosey.ddd.customer.domain.runtime.service.impl;

import com.mosey.ddd.customer.domain.sdk.repository.CustomerRepository;
import com.mosey.ddd.customer.domain.sdk.entity.CustomerEntity;
import com.mosey.ddd.customer.domain.sdk.service.CustomerDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TangJie
 * @since 2023/4/19
 */
@Service
public class CustomerDomainServiceImpl implements CustomerDomainService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Boolean checkBlackByCustomerId(Long id) {
        CustomerEntity customerEntity = customerRepository.findById(id);
        return customerEntity.isBlack();
    }
}
