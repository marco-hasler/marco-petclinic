package marco.petclinic.marcopetclinic.services;

import marco.petclinic.marcopetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
