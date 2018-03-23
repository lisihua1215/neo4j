package com.csf.graph.spring.neo4j.config;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by changqi.wu on 2018/3/22.
 */

@Configuration
@EnableNeo4jRepositories("com.csf.graph.neo4j.dao")
@EntityScan(basePackages = "com.csf.graph.neo4j.entity")
@EnableTransactionManagement
public class Neo4jConfig {


    /**
     * 配置文件
     * URI=bolt://localhost
         username=user
         password=secret
         connection.pool.size=... #see java driver doc
         encryption.level=... #see java driver doc
         trust.strategy=... #see java driver doc
         trust.certificate.file=... #see java driver doc
         connection.liveness.check.timeout=... #see java driver doc
         verify.connection=... #see java driver doc
     *
     *
     */
//    @Bean
//    public org.neo4j.ogm.config.Configuration configuration() {
//        ConfigurationSource properties = new ClasspathConfigurationSource("neo4j.properties");
//        return new org.neo4j.ogm.config.Configuration.Builder(properties).build();
//    }

    @Bean
    public org.neo4j.ogm.config.Configuration configuration() {
        org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration.Builder()
                .uri("bolt://192.168.30.134")
                .credentials("neo4j", "881215")
                .build();
        return configuration;
    }

    @Bean
    public SessionFactory sessionFactory() {
        return new SessionFactory(configuration());
    }

    @Bean
    public Neo4jTransactionManager transactionManager() {
        return new Neo4jTransactionManager(sessionFactory());
    }

}
