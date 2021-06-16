package com.dio.personapi.services;

import com.dio.personapi.dto.MessageResponseDTO;
import com.dio.personapi.entities.Person;
import com.dio.personapi.dto.request.PersonDTO;
import com.dio.personapi.exception.PersonNotFoundException;
import com.dio.personapi.mapper.PersonMapper;
import com.dio.personapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService {
    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO.builder()
                .message("Created person with ID"+ savedPerson.getId())
                .build();
    }

    public List<PersonDTO> listAll() {
        List<Person> allPeople = personRepository.findAll();
        return allPeople.stream().map(personMapper::toDTO).collect(Collectors.toList());
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException{
        Optional<Person> optionalPerson = personRepository.findById(id);
        if(optionalPerson.isEmpty()){
            throw new PersonNotFoundException(id);
        }
        return personMapper.toDTO(optionalPerson.get());
    }
}
