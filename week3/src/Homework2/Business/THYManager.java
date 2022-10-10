package Homework2.Business;

import Homework2.Collections.CompanyCollection;
import Homework2.Entities.*;

import java.util.List;

public class THYManager implements ITHYService {
    private CompanyCollection companyCollection;

    public THYManager() {
        this.companyCollection=new CompanyCollection();
        this.addSeatList();
    }
    private void addSeatList() {
        Seat[] seats=new Seat[]{
                new Seat("A1", SeatType.BUSINESS,true, CompanyType.THY),
                new Seat("A2",SeatType.BUSINESS,true,  CompanyType.THY),
                new Seat("A3",SeatType.BUSINESS,true,  CompanyType.THY),
                new Seat("B1",SeatType.ECONOMY,true, CompanyType.THY),
                new Seat("B2",SeatType.ECONOMY,true,  CompanyType.THY),
                new Seat("B3",SeatType.ECONOMY,true,  CompanyType.THY),
        };

        for(Seat seat1:seats){
            this.companyCollection.addSeats(seat1);
        }
    }
    @Override
    public List<Seat> getAllSeats() {
      return this.companyCollection.getAllSeats();
    }

    @Override
    public List<Seat> getAllEmptySeats() {
        return this.companyCollection.getAllEmptySeats();
    }

    @Override
    public List<Seat> getAllFullSeats() {
        return this.companyCollection.getAllFullSeats();
    }

    @Override
    public void add(Seat seat) {
        this.companyCollection.addSeats(seat);
    }

    @Override
    public long countOfFullSeat() {
        return this.companyCollection.countOfAllSeat();
    }

    @Override
    public long countOfEmptySeat() {
        return this.companyCollection.countOfAllEmpty();
    }

    @Override
    public long countOfAllSeats() {
        return this.companyCollection.countOfAllSeat();
    }

    @Override
    public void foodService(Passenger passenger) {
        System.out.println("Yemek servisimiz mevcuttur.");
    }

    @Override
    public void buyTicket(Seat seat) {
        for (Seat seat1:this.companyCollection.getAllTHYSeats()){
            if (!seat1.isEmpty()){
                System.out.println("koltuk boş değil");
                break;
            }
            else{
                seat1.setEmpty(false);
                System.out.println("bilet alındı :"+seat.getSeatNo());
                System.out.println("bilet tipi: "+seat.getSeatType());
                System.out.println("bilet ücreti: "+seat.getInvoice());
                break;
            }
        }
    }

    @Override
    public List<Seat> getAllTHYEmptySeat() {
        return this.companyCollection.getAllTHYEmptySeats();
    }

    @Override
    public List<Seat> getAllTHYFullSeat() {
        return this.companyCollection.getAllTHYFullSeats();
    }

    @Override
    public List<Seat> getAllTHYSeat() {
        return this.companyCollection.getAllTHYSeats();
    }

    @Override
    public long countOfTHYFullSeat() {
        return this.companyCollection.countOfTHYFullSeat();
    }

    @Override
    public long countOfTHYEmptySeat() {
        return this.companyCollection.countOfTHYEmptySeat();
    }
}
