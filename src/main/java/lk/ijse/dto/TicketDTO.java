package lk.ijse.dto;

public class TicketDTO {

    private Integer tid;
    private String tocity;
    private String fromcity;
    private String date;
    private int pasengerNo;
    private String fclass;

    public TicketDTO() {
    }

    public TicketDTO(Integer tid, String tocity, String fromcity, String date, int pasengerNo, String fclass) {
        this.tid = tid;
        this.tocity = tocity;
        this.fromcity = fromcity;
        this.date = date;
        this.pasengerNo = pasengerNo;
        this.fclass = fclass;
    }

    public TicketDTO(String tocity, String fromcity, String date, int pasengerNo, String fclass) {
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
        return "TicketDTO{" +
                "tid=" + tid +
                ", tocity='" + tocity + '\'' +
                ", fromcity='" + fromcity + '\'' +
                ", date='" + date + '\'' +
                ", pasengerNo=" + pasengerNo +
                ", fclass='" + fclass + '\'' +
                '}';
    }
}
