package com.mosey.ddd.customer.domain.sdk.entity.objectvalue;

import com.mosey.ddd.customer.domain.sdk.constants.Constants;
import lombok.Getter;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author TangJie
 * @since 2023/4/19
 */
public class PhoneOV implements Serializable {
    private static final long serialVersionUID = 4415663991199373169L;


    @Getter
    private String phoneNumber;

    public PhoneOV(String phoneNumber) {
        if(!matchPhone(phoneNumber)){
            throw new RuntimeException("电话号码不符合要求");
        }
        this.phoneNumber = phoneNumber;
    }

    private Boolean matchPhone(String tel){
        Pattern pattern = Pattern.compile(Constants.PHONE_REG);

        Matcher matcher = pattern.matcher(tel);
        return matcher.matches();

    }
}
