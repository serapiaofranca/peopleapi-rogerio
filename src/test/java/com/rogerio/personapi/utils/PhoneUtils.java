package com.rogerio.personapi.utils;

import com.rogerio.personapi.dto.request.PhoneDTO;
import com.rogerio.personapi.entity.Phone;
import com.rogerio.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "1193456-7890";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 101l;

    public static PhoneDTO createFakeDTO(){
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity(){
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
