package pl.coderslab.charity.model.services;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.repo.CategoryRepository;

import java.util.List;

@Service
public class MyCategoryService implements CategoryService{
    private final CategoryRepository categoryRepository;

    public MyCategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> allCategories() {
        return categoryRepository.findAll();
    }
}
