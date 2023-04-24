package com.mosey.ddd.customer.domain.sdk.entity.objectvalue;

import lombok.Getter;

import java.io.Serializable;

/**
 * @author TangJie
 * @since 2023/4/19
 */
public class NameOV implements Serializable {
    private static final long serialVersionUID = -3225864149084589583L;

    @Getter
    private String name;

    public NameOV(String name){
        if(name.length() > 4){
            throw new RuntimeException("名称太长");
        }
        this.name = name;
    }
}
