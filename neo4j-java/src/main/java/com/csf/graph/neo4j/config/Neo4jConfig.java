package com.csf.graph.neo4j.config;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by changqi.wu on 2018/3/23.
 */
@Configuration
@ComponentScan(basePackages = "com.csf.graph.neo4j")
@EnableNeo4jRepositories(basePackages = "com.csf.graph.neo4j.dao")
@EnableTransactionManagement
public class Neo4jConfig {


    @Bean
    public SessionFactory sessionFactory() {
        // with domain entity base package(s)
        return new SessionFactory(configuration(), "com.csf.graph.neo4j.entity");
    }

    @Bean
    public org.neo4j.ogm.config.Configuration configuration() {
        org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration.Builder()
                .uri("bolt://192.168.30.134")
                .credentials("neo4j", "881215")
                .build();
        return configuration;
    }

    @Bean
    public Neo4jTransactionManager transactionManager() {
        return new Neo4jTransactionManager(sessionFactory());
    }
}
