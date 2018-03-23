package com.csf.graph.spring.neo4j.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by changqi.wu on 2018/3/22.
 */
@NodeEntity
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String name;
    private Integer level;
    private String industry;
    private String father;

    @Relationship(type = "ACTED_IN", direction = Relationship.INCOMING)
    private List<RalationShip> ships = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }
}
