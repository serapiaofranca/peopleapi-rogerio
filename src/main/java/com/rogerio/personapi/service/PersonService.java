package com.rogerio.personapi.service;

import com.rogerio.personapi.dto.request.PersonDTO;
import com.rogerio.personapi.dto.response.MessageResponseDTO;
import com.rogerio.personapi.entity.Person;
import com.rogerio.personapi.mapper.PersonMapper;
import com.rogerio.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO.builder()
                .message("Created person with ID: " + savedPerson.getId())
                .build();
    }
}
