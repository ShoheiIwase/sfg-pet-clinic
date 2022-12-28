package iwase.shohei.sfgpetclinic.services;

import iwase.shohei.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
