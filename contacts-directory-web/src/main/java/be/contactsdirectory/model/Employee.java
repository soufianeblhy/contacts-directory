package be.contactsdirectory.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    @NotNull
    private String address;
    @Column(nullable = false)
    @NotNull
    private String lastName;
    @Column(nullable = false)
    @NotNull
    private String firstName;
    @Column(nullable = true)
    @Min(100000000L)
    @Max(9999999999L)
    private Long vatNumber;

    @ManyToMany(mappedBy = "employees")
    private List<Company> companies;

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(Long vatNumber) {
        this.vatNumber = vatNumber;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

}
