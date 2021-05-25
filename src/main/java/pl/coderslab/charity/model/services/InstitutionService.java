package pl.coderslab.charity.model.services;


import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Institution;

import java.util.List;
import java.util.Optional;


public interface InstitutionService {

    List<Institution> getInstitutions();

}
