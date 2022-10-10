package Homework2.Entities;

public class Seat {
    private String seatNo;
    private SeatType seatType;
    private boolean isEmpty;
    private CompanyType companyType;
    public Seat(String seatNo, SeatType seatType, boolean isEmpty,CompanyType companyType) {
        this.seatNo = seatNo;
        this.seatType = seatType;
        this.isEmpty = isEmpty;
        this.companyType=companyType;
    }

    public CompanyType getCompanyType() {
        return companyType;
    }

    public void setCompanyType(CompanyType companyType) {
        this.companyType = companyType;
    }

    public double getInvoice() {
     if (this.seatType==SeatType.BUSINESS)
        return 1500.0;
     else return 800.0;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
