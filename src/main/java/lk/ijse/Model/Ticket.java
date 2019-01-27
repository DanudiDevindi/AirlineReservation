package lk.ijse.Model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Ticket")
public class Ticket  implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "tid")
    private Integer tid;
    @Column(name = "Tocity")
    private String tocity;
    @Column(name = "FromCity")
    private String fromcity;
    @Column(name = "date")
    private String date;
    @Column(name = "pNo")
    private int pasengerNo;
    @Column(name = "fclass")
    private String fclass;

//    @ManyToOne
//    @JoinColumn(name = "paid",referencedColumnName = "paid")
//    private Pasenger paid;


    public Ticket() {
    }

    public Ticket(String tocity, String fromcity, String date, int pasengerNo, String fclass) {
        this.tocity = tocity;
        this.fromcity = fromcity;
        this.date = date;
        this.pasengerNo = pasengerNo;
        this.fclass = fclass;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPasengerNo() {
        return pasengerNo;
    }

    public void setPasengerNo(int pasengerNo) {
        this.pasengerNo = pasengerNo;
    }

    public String getFclass() {
        return fclass;
    }

    public void setFclass(String fclass) {
        this.fclass = fclass;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "tid=" + tid +
                ", tocity='" + tocity + '\'' +
                ", fromcity='" + fromcity + '\'' +
                ", date='" + date + '\'' +
                ", pasengerNo=" + pasengerNo +
                ", fclass='" + fclass + '\'' +
                '}';
    }
}
