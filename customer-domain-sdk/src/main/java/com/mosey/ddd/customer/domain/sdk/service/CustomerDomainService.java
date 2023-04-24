package com.mosey.ddd.customer.domain.sdk.service;

/**
 * @author TangJie
 * @since 2023/4/19
 */
public interface CustomerDomainService {
    Boolean checkBlackByCustomerId(Long id);
}
