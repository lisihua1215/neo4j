package com.csf.graph.spring.neo4j.web;

import com.csf.graph.spring.neo4j.dao.ProductDao;
import com.csf.graph.spring.neo4j.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by changqi.wu on 2018/3/22.
 */

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @RequestMapping("/add")
    public String addProduct(Product product){

        productDao.save(product);
        return "success";
    }

    @RequestMapping("query")
    public Iterable<Product> laod(){
        return productDao.findAll();
    }

}
