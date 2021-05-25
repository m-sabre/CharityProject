package pl.coderslab.charity.model.dto;

import org.springframework.format.annotation.DateTimeFormat;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Institution;


import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class DonationDto {

    @NotNull
    @Min(1)
    private Integer quantity;
    @NotEmpty
    private Set<Category> categories;
    @NotNull
    private Institution institution;
    @NotBlank
    @Size(min=3)
    private String street;
    @NotBlank
    @Size(min=3)
    private String city;
    @NotBlank
    @Size(min=6)
    private String zipCode;
    @Future
    @NotNull
    @DateTimeFormat(pattern="YYY-MM-DD")
    private LocalDate pickUpDate;
    @NotNull
    @DateTimeFormat(pattern="HH:MM")
    private LocalTime pickUpTime;
    @Size(max=200)
    private String pickUpComments;

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

    @Override
    public String toString() {
        return "DonationDto{" +
                "quantity=" + quantity +
                ", categories=" + categories +
                ", institution=" + institution +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", pickUpDate=" + pickUpDate +
                ", pickUpTime=" + pickUpTime +
                ", pickUpComments='" + pickUpComments + '\'' +
                '}';
    }
}
