package pl.coderslab.charity.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.model.Donation;

public interface DonationRepository extends JpaRepository<Donation,Long> {
    @Query("select sum(d.quantity) from Donation d")
    Integer sumOfBags(); //optional albo spr w service czy null i zwrócic 0
}
