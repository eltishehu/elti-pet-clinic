package com.elti.petclinic.model;

import java.util.Set;

/**
 * Created by e.sh. on 13-Sep-18.
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
