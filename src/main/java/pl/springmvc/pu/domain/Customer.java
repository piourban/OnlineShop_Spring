package pl.springmvc.pu.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String address;
    private Long noOfOrdersMade;

    public Customer() {
    }

    public Customer(String name, String surname, String email, String address, Long noOfOrdersMade) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.noOfOrdersMade = noOfOrdersMade;
    }

    public Customer(Long id, String name, String surname, String email, String address, Long noOfOrdersMade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.noOfOrdersMade = noOfOrdersMade;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getNoOfOrdersMade() {
        return noOfOrdersMade;
    }

    public void setNoOfOrdersMade(Long noOfOrdersMade) {
        this.noOfOrdersMade = noOfOrdersMade;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", noOfOrdersMade=" + noOfOrdersMade +
                '}';
    }
}
