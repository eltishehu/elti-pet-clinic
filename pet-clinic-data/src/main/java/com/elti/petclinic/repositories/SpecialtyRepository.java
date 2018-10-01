package com.elti.petclinic.repositories;

import com.elti.petclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by e.sh. on 01-Oct-18
 */
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
