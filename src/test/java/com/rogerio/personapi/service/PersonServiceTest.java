package com.rogerio.personapi.service;

import com.rogerio.personapi.dto.request.PersonDTO;
import com.rogerio.personapi.entity.Person;
import com.rogerio.personapi.repository.PersonRepository;
import com.rogerio.personapi.utils.PersonUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.rogerio.personapi.utils.PhoneUtils.createFakeEntity;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGivenPersonDTOthenReturnSavedMessage(){
        PersonDTO personDTO = PersonUtils.createFakeDTO();
        Person expectedSavedPerson = PersonUtils.createFakeEntity();
    }

}
