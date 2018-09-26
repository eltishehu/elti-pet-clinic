package com.elti.petclinic.services;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Set;

/**
 * Created by e.sh. on 26-Sep-18
 */
public interface CrudService<T, I> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
