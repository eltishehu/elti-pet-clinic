package com.elti.petclinic.services;

import java.util.Set;

/**
 * Created by e.sh. on 26-Sep-18
 */
public interface CrudService<T, I> {

    Set<T> findAll();

    T findById(I id);

    T save(T object);

    void delete(T object);

    void deleteById(I id);
}
