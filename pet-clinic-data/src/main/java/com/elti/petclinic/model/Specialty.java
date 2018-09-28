package com.elti.petclinic.model;

/**
 * Created by e.sh. on 28-Sep-18
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
