package com.elti.petclinic.repositories;

import com.elti.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by e.sh. on 01-Oct-18
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
