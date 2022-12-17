package io.zipcoder.crudapp.services;

import io.zipcoder.crudapp.models.Person;
import io.zipcoder.crudapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public Iterable<Person> showAll(){ return personRepository.findAll();}
    public Person show(Integer id){return personRepository.findOne(id);}
    public Person save(Person person){return personRepository.save(person);}
    public Boolean delete(Integer id){  personRepository.delete(id); return true;}


}
