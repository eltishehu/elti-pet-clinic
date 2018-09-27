package com.elti.petclinic.services.map;

import com.elti.petclinic.model.Vet;
import com.elti.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by e.sh. on 26-Sep-18
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}
