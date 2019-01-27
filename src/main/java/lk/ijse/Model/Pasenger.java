package lk.ijse.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Pasenger")
public class Pasenger implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "paid")
    private int paid;
    @Column(name = "password")
    private int password;
    @Column(name = "name")
    private String name;
    @Column(name = "TP")
    private int tp;
    @Column(name = "email")
    private String email;
    @Column(name = "DOB")
    private String dob;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private  String country;

    public Pasenger() {
    }

    public Pasenger(int password, String name, int tp, String email, String dob, String address, String city, String country) {
        this.password = password;
        this.name = name;
        this.tp = tp;
        this.email = email;
        this.dob = dob;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Pasenger{" +
                "paid=" + paid +
                ", password=" + password +
                ", name='" + name + '\'' +
                ", tp=" + tp +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
