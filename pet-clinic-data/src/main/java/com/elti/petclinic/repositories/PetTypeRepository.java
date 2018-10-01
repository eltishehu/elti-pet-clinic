package com.elti.petclinic.repositories;

import com.elti.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by e.sh. on 01-Oct-18
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
