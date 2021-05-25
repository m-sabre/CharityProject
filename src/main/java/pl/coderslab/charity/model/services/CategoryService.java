package pl.coderslab.charity.model.services;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Donation;

import java.util.List;
import java.util.Optional;


public interface CategoryService {
    List <Category> allCategories();

}

