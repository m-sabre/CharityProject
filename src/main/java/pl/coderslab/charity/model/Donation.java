package pl.coderslab.charity.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;



@Entity
@Table(name="donation")
public class Donation {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Min(1)
    private Integer quantity;
    @ManyToMany
    @NotEmpty
    @JoinTable(name = "donation_category", joinColumns = @JoinColumn(name = "donation_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;
    @ManyToOne
    @NotNull
    //@Valid
    private Institution institution;
    @NotBlank
    @Size(min=3)
    private String street;
    @NotBlank
    @Size(min=3)
    private String city;
    @NotBlank
    @Pattern(regexp = "([0-9]{2})-([0-9]{3})")
    private String zipCode;
    @Future
    @NotNull
    @DateTimeFormat(pattern="dd-mm-yyy")
    private LocalDate pickUpDate;
    @NotNull
    @DateTimeFormat(pattern="HH:MM")
    private LocalTime pickUpTime;
    @Size(max=200)
    private String pickUpComments;
    @NotBlank
    @Pattern(regexp = "[0-9]{9}")
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public LocalDate getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(LocalDate pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public LocalTime getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(LocalTime pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public String getPickUpComments() {
        return pickUpComments;
    }

    public void setPickUpComments(String pickUpComments) {
        this.pickUpComments = pickUpComments;
    }
}
