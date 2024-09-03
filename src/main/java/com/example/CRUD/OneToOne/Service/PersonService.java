package com.example.CRUD.OneToOne.Service;

import com.example.CRUD.OneToOne.Model.Person;
import com.example.CRUD.OneToOne.Repository.AdhaarRepository;
import com.example.CRUD.OneToOne.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.example.CRUD.OneToOne.Model.Adhaar;
@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    @Autowired
    AdhaarRepository adhaarRepository;
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Person register(Person person){
        Adhaar adhaar = person.getAdhaar();
        if(person.getAdhaar() != null) {
            Adhaar adhaarInAdhaarTable = adhaarRepository.findById(adhaar.getId()).orElseThrow(() -> new RuntimeException("Adhaar Id not found in adhaar table"));
            person.setAdhaar(adhaarInAdhaarTable);

        }
        return personRepository.save(person);
    }

    public Adhaar entryUser(Adhaar adhaar){
        return adhaarRepository.save(adhaar);
    }

    public Person renovate(Integer id,Person person){
        Person existPerson = personRepository.findById(id).orElseThrow(() -> new RuntimeException("Person id is not present"));
        if(person.getName() != null ){
            existPerson.setName(person.getName());
        }
        if(person.getAge() != null ){
            existPerson.setAge(person.getAge());
        }


        if(person.getAdhaar() != null){
            Adhaar adhaarInPersonTable = person.getAdhaar();
            Integer adhaarId = adhaarInPersonTable.getId();
            Adhaar existAdhaar = adhaarRepository.findById(adhaarId).orElseThrow(() -> new RuntimeException("Adhaar Id is not present in adhaar table"));
            existPerson.setAdhaar(existAdhaar);
        }
        return personRepository.save(existPerson);
    }
}
