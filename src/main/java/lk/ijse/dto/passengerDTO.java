package lk.ijse.dto;

public class passengerDTO {
    private int paid;
    private int password;
    private String name;
    private int tp;
    private String email;
    private String dob;
    private String address;
    private String city;
    private  String country;

    public passengerDTO() {
    }

    public passengerDTO(int paid, int password, String name, int tp, String email, String dob, String address, String city, String country) {
        this.paid = paid;
        this.password = password;
        this.name = name;
        this.tp = tp;
        this.email = email;
        this.dob = dob;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public passengerDTO(int password, String name, int tp, String email, String dob, String address, String city, String country) {

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
        return "passengerDTO{" +
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
