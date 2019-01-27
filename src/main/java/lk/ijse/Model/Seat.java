package lk.ijse.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="Seat")

public class Seat implements Serializable {
    @Id
    @GeneratedValue
    @Column (name = "sid")
    private  int sid;
    @Column (name ="seatName")
    private String sName;
    @Column (name = "noOfSeats")
    private int NoOfSeats;


    public Seat() {
    }

    public Seat( int sid , String sName, int noOfSeats) {
        this.sid = sid;
        this.sName = sName;
        this.NoOfSeats = noOfSeats;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getNoOfSeats() {
        return NoOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        NoOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", NoOfSeats=" + NoOfSeats +
                '}';
    }
}
