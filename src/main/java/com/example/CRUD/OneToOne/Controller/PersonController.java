package com.example.CRUD.OneToOne.Controller;

import com.example.CRUD.OneToOne.Model.Adhaar;
import com.example.CRUD.OneToOne.Model.Person;
import com.example.CRUD.OneToOne.Service.PersonService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping()
    public List<Person> printAll(){
        return personService.getAll();
    }

    @PostMapping("/insertPerson")
    public Person insert(@RequestBody Person person){
        return personService.register(person);
    }

    @PostMapping("/insertAdhaar")
    public Adhaar registerUser(@RequestBody Adhaar adhaar){
        return personService.entryUser(adhaar);
    }

    @PutMapping("/update/{id}")
    public Person update(@PathVariable Integer id,@RequestBody Person person){
        return personService.renovate(id,person);
    }

}
