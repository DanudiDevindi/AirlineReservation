package lk.ijse.dto;

public class PaymentDTO {

    private int pid;
    private String name;
    private String country;
    private String bankname;
    private int creditcardno;
    private String flightname;
    private double price;

    public PaymentDTO() {
    }

    public PaymentDTO(int pid, String name, String country, String bankname, int creditcardno, String flightname, double price) {
        this.pid = pid;
        this.name = name;
        this.country = country;
        this.bankname = bankname;
        this.creditcardno = creditcardno;
        this.flightname = flightname;
        this.price = price;
    }

    public PaymentDTO(String name, String country, String bankname, int creditcardno, String flightname, double price) {
        this.name = name;
        this.country = country;
        this.bankname = bankname;
        this.creditcardno = creditcardno;
        this.flightname = flightname;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public int getCreditcardno() {
        return creditcardno;
    }

    public void setCreditcardno(int creditcardno) {
        this.creditcardno = creditcardno;
    }

    public String getFlightname() {
        return flightname;
    }

    public void setFlightname(String flightname) {
        this.flightname = flightname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", bankname='" + bankname + '\'' +
                ", creditcardno=" + creditcardno +
                ", flightname='" + flightname + '\'' +
                ", price=" + price +
                '}';
    }
}
