package com.csf.graph.neo4j.entity;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

/**
 * Created by changqi.wu on 2018/3/23.
 */
@NodeEntity
public class Person {
    private Long id;
    private String name;

    @Relationship(type = "FRIEND", direction = "OUTGOING")
    private Set<Person> friends;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void knows(Person friend) {
        friends.add(friend);
    }
}
