package com.mosey.ddd.customer.domain.sdk.entity;

import com.mosey.ddd.customer.domain.sdk.entity.objectvalue.BlackListOV;
import com.mosey.ddd.customer.domain.sdk.entity.objectvalue.NameOV;
import com.mosey.ddd.customer.domain.sdk.entity.objectvalue.PhoneOV;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author TangJie
 * @since 2023/4/19
 */
@Getter
public class CustomerEntity implements Serializable {
    private static final long serialVersionUID = 409382386286945077L;

    private Long id;

    private NameOV name;

    private PhoneOV phone;

    private BlackListOV blackList;

    public Boolean isBlack(){
        return blackList.isBlack();
    }

    public CustomerEntity (){
    }

    //可以抽象成工厂模式 屏蔽其复杂性。
    public CustomerEntity (Long id,String name,String phone,Boolean blackList,String blackListReason){
        this.id = id;

        this.name = new NameOV(name);

        this.phone = new PhoneOV(phone);

        this.blackList = new BlackListOV(blackList,blackListReason);
    }
}
