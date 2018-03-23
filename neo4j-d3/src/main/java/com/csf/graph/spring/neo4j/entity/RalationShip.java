package com.csf.graph.spring.neo4j.entity;

import org.springframework.data.annotation.Id;

/**
 * Created by changqi.wu on 2018/3/22.
 */

public class RalationShip {

    @Id
    private Long id;
    private String pcode;
    private String rcode;
    private String ralated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    public String getRalated() {
        return ralated;
    }

    public void setRalated(String ralated) {
        this.ralated = ralated;
    }
}
