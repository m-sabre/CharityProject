package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.model.dto.DonationDto;
import pl.coderslab.charity.model.services.CategoryService;
import pl.coderslab.charity.model.services.DonationService;
import pl.coderslab.charity.model.services.InstitutionService;

import javax.validation.Valid;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/form")
public class DonationController {

    private final CategoryService categoryService;
    private final InstitutionService institutionService;
    private final DonationService donationService;

    public DonationController(CategoryService categoryService, InstitutionService institutionService, DonationService donationService) {
        this.categoryService = categoryService;
        this.institutionService = institutionService;
        this.donationService = donationService;
    }

    @GetMapping
    public String donationForm (Model model){
        model.addAttribute("donation", new DonationDto());
        return "form";
    }

    @PostMapping
    public String postForm (@ModelAttribute ("donation") @Valid DonationDto donation, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "form";
        }
        donationService.add(donation);
        return "form-confirmation";
    }
    @ModelAttribute("formCategories")
    public List<Category> allCategory(){
        return categoryService.allCategories();
    }
    @ModelAttribute("institutions")
    public Collection<Institution> institutions(){
        return institutionService.getInstitutions();
    }


}
