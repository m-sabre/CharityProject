package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.model.services.DonationService;
import pl.coderslab.charity.model.services.InstitutionService;

import java.util.List;

@Controller
public class HomeController {
    final private InstitutionService institutionService;
    final private DonationService donationService;

    public HomeController(InstitutionService institutionService, DonationService donationService) {
        this.institutionService = institutionService;
        this.donationService = donationService;
    }

    @RequestMapping("/")
    public String homeAction (Model model){
        List<Institution> institutions=institutionService.getInstitutions();
        model.addAttribute("institutions", institutions);
        return "index";
    }

    @ModelAttribute("sumOfBags")
    public Integer sumAllDonations(){
        return donationService.sumOfBags();

    }

    @ModelAttribute("noOfDonations")
    public Long noOfDonations(){
        return donationService.noOfDonations();
    }

}
