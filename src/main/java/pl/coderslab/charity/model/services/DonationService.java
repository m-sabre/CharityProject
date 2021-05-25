package pl.coderslab.charity.model.services;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.model.dto.DonationDto;

import java.util.List;
import java.util.Optional;


public interface DonationService {

 Integer sumOfBags();
 Long noOfDonations();
 void add(DonationDto donationDto);
}
