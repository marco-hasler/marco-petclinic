package marco.petclinic.marcopetclinic.services;

import marco.petclinic.marcopetclinic.model.Owner;
import marco.petclinic.marcopetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
