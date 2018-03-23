package com.csf.graph.neo4j.dao;

import com.csf.graph.neo4j.entity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends Neo4jRepository<Person, Long> {

  List<Person> findByName(String name);

  List<Person> findByNameLike(String name);
}