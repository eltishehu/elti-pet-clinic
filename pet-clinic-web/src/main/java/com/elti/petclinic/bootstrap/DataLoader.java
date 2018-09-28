package com.elti.petclinic.bootstrap;

import com.elti.petclinic.model.Owner;
import com.elti.petclinic.model.Pet;
import com.elti.petclinic.model.PetType;
import com.elti.petclinic.model.Vet;
import com.elti.petclinic.services.OwnerService;
import com.elti.petclinic.services.PetTypeService;
import com.elti.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by e.sh. on 27-Sep-18
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        // =========================================================

        System.out.println("Loaded PetTypes...");

        // =========================================================

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel st.");
        owner1.setCity("Miami");
        owner1.setTelephone("+355683498229");

        Pet mikesDog = new Pet();
        mikesDog.setName("Rosco");
        mikesDog.setPetType(savedDogPetType);
        mikesDog.setOwner(owner1);
        mikesDog.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesDog);

        ownerService.save(owner1);

        // =========================================================

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenn");
        owner2.setAddress("123 Brickerel st.");
        owner2.setCity("Miami");
        owner2.setTelephone("+355681265789");

        Pet fionasCat = new Pet();
        fionasCat.setName("Catty");
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        // =========================================================

        System.out.println("Loaded Owners...");

        // =========================================================

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("John");
        vet2.setLastName("Fletcher");

        vetService.save(vet2);

        // =========================================================

        System.out.println("Loaded Vets...");

        // =========================================================
    }
}
