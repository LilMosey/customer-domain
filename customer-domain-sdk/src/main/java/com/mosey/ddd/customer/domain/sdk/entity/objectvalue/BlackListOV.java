package com.mosey.ddd.customer.domain.sdk.entity.objectvalue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author TangJie
 * @since 2023/4/19
 */
@AllArgsConstructor
public class BlackListOV implements Serializable {

    private static final long serialVersionUID = -6089967859957593766L;

    private Boolean black;

    @Getter
    private String reason;

    public Boolean isBlack(){
        return Boolean.TRUE.equals(black);
    }
}
