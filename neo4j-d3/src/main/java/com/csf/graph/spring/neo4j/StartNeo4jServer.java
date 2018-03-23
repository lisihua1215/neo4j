package com.csf.graph.spring.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Created by changqi.wu on 2018/3/22.
 */

@SpringBootApplication
@EntityScan("com.csf.graph.neo4j.entity")
public class StartNeo4jServer {


    public static void main(String[] args) {
        SpringApplication.run(StartNeo4jServer.class, args);
        System.out.println("start neo4j server");
    }
}
