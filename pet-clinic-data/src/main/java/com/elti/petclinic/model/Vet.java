package com.elti.petclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by e.sh. on 13-Sep-18.
 */
public class Vet extends Person {

    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
