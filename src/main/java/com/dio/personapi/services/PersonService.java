package com.dio.personapi.services;

import com.dio.personapi.dto.MessageResponseDTO;
import com.dio.personapi.entities.Person;
import com.dio.personapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO.builder()
                .message("Created person with ID"+ savedPerson.getId())
                .build();
    }
}
