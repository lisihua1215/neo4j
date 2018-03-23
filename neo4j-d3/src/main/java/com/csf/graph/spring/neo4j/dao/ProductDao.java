package com.csf.graph.spring.neo4j.dao;

import com.csf.graph.spring.neo4j.entity.Product;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * Created by changqi.wu on 2018/3/22.
 */

public interface ProductDao extends Neo4jRepository<Product,Long> {

}
