package pl.coderslab.charity.model.services;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.model.repo.InstitutionRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MyInstitutionService implements InstitutionService{
    private final InstitutionRepository institutionRepository;

    public MyInstitutionService(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }

    @Override
    public List<Institution> getInstitutions() {
//        return institutionRepository.findAll(); //limit dla wyświetlania? w service metoda zwracająca max np 4
        return institutionRepository.findAll(PageRequest.of(0, 4)).getContent();
    }


}
