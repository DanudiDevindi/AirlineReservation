package lk.ijse.Model;

import javax.persistence.*;

@Entity
@Table(name = "Flight")
public class Flight {
    @Id
    @GeneratedValue
    @Column(name = "fid")
    private Integer fid;
    @Column(name = "Tocity")
    private String tocity;
    @Column(name = "fromcity")
    private String fromcity;
    @Column(name = "departure")
    private String departure;
    @Column(name = "Arrival")
    private String arrival;
    @Column(name = "flightName")
    private String flightname;
    @Column(name = "price")
    private double price;

    public Flight() {
    }

    public Flight(Integer fid,String tocity, String fromcity, String departure, String arrival, String flightname, double price) {
        this.fid=fid;
        this.tocity = tocity;
        this.fromcity = fromcity;
        this.departure = departure;
        this.arrival = arrival;
        this.flightname = flightname;
        this.price = price;
    }

    public Flight(String tocity, String fromcity, String departure, String arrival, String flightname, double price) {
        this.tocity = tocity;
        this.fromcity = fromcity;
        this.departure = departure;
        this.arrival = arrival;
        this.flightname = flightname;
        this.price = price;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getTocity() {
        return tocity;
    }

    public void setTocity(String tocity) {
        this.tocity = tocity;
    }

    public String getFromcity() {
        return fromcity;
    }

    public void setFromcity(String fromcity) {
        this.fromcity = fromcity;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
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
        return "Flight{" +
                "fid=" + fid +
                ", tocity='" + tocity + '\'' +
                ", fromcity='" + fromcity + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", flightname='" + flightname + '\'' +
                ", price=" + price +
                '}';
    }
}
