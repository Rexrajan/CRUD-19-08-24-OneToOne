package com.example.CRUD.OneToOne.Repository;

import com.example.CRUD.OneToOne.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

}
