package pl.coderslab.charity.model.services;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.model.dto.DonationDto;
import pl.coderslab.charity.model.repo.DonationRepository;

@Service
public class MyDonationService implements DonationService{

    private final DonationRepository donationRepository;

    public MyDonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @Override
    public Integer sumOfBags() {
        return donationRepository.sumOfBags();
    }

    @Override
    public Long noOfDonations() {
        return donationRepository.count();
    }

    @Override
    public void add(DonationDto donationDto) {
        Donation donation= new Donation();

        donation.setQuantity(donationDto.getQuantity());
        donation.setCategories(donationDto.getCategories());
        donation.setCity(donationDto.getCity());
        donation.setStreet(donation.getStreet());
        donation.setInstitution(donation.getInstitution());
        donation.setPickUpComments(donationDto.getPickUpComments());
        donation.setPickUpDate(donationDto.getPickUpDate());
        donation.setPickUpTime(donationDto.getPickUpTime());
        donation.setZipCode(donationDto.getZipCode());

        donationRepository.save(donation);

    }
}
