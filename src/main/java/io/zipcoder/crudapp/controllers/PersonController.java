package io.zipcoder.crudapp.controllers;

import io.zipcoder.crudapp.models.Person;
import io.zipcoder.crudapp.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/persons")
public class PersonController {
    @Autowired
   private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @GetMapping("/all")
    public ResponseEntity<Iterable<Person>> showAll(){
        return new ResponseEntity<>(personService.showAll(), HttpStatus.OK);}
    @GetMapping("/{id}")
    public ResponseEntity<Person> show(@PathVariable Integer id){
        return new ResponseEntity<>(personService.show(id),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person person){
        return  new ResponseEntity<>(personService.save(person),HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
        return new ResponseEntity<>(personService.delete(id),HttpStatus.NO_CONTENT);
    }
    }
