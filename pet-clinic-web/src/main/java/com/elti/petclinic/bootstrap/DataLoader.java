package com.elti.petclinic.bootstrap;

import com.elti.petclinic.model.*;
import com.elti.petclinic.services.OwnerService;
import com.elti.petclinic.services.PetTypeService;
import com.elti.petclinic.services.SpecialtyService;
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
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if(count == 0) {
            loadData();
        }

    }

    private void loadData() {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        // =========================================================

        System.out.println("Loaded PetTypes...");

        // =========================================================

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        radiology.setDescription("Surgery");
        Specialty savedSurgery = specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        radiology.setDescription("Dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);

        // =========================================================

        System.out.println("Loaded Specialties...");

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
        vet1.getSpecialties().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("John");
        vet2.setLastName("Fletcher");
        vet2.getSpecialties().add(savedSurgery);
        vet2.getSpecialties().add(savedDentistry);
        vetService.save(vet2);

        // =========================================================

        System.out.println("Loaded Vets...");

        // =========================================================
    }
}
