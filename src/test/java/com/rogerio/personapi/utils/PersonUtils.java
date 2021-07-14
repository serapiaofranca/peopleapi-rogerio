package com.rogerio.personapi.utils;

import com.rogerio.personapi.dto.request.PersonDTO;
import com.rogerio.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "UserTest";
    private static final String LAST_NAME = "LastTest";
    private static final String CPF_NUMBER = "102.505.470-90";
    private static final Long PERSON_ID = 100L;
    private static final LocalDate BIRTH_DATE = LocalDate.of(2001, 10, 15);

    public static PersonDTO createFakeDTO(){
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("20-04-2000")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity(){
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }

}
