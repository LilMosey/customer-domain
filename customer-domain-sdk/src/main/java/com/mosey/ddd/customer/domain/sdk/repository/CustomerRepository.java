package com.mosey.ddd.customer.domain.sdk.repository;

import com.mosey.ddd.customer.domain.sdk.entity.CustomerEntity;

/**
 * @author TangJie
 * @since 2023/4/19
 */
public interface CustomerRepository {
    CustomerEntity findById(Long id);
}
