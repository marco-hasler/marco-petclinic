package marco.petclinic.marcopetclinic.services;

import marco.petclinic.marcopetclinic.model.Owner;
import marco.petclinic.marcopetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Owner owner);
    Set<Pet> findAll();
}
