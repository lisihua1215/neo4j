package com.csf.graph.neo4j.service;

import com.csf.graph.neo4j.dao.PersonRepository;
import com.csf.graph.neo4j.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public void doWork() {

        Person jon = new Person("Jon");
        Person emil = new Person("Emil");
        Person rod = new Person("Rod");

        emil.knows(jon);
        emil.knows(rod);

        // Persist entities and relationships to graph database
        personRepository.save(emil);

//        for (Person friend : emil.getFriends()) {
//            System.out.println("Friend: " + friend);
//        }
//
//        // Control loading depth
//        Person thatSamejon = personRepository.findOne(id, 2);
//        for (Person friend : jon.getFriends()) {
//            System.out.println("Jon's friends to depth 2: " + friend);
//        }
    }
}