package Homework2.Business;

import Homework2.Collections.CompanyCollection;
import Homework2.Entities.*;

import java.util.List;

public class PegasusManager implements IPegasusService{
    private CompanyCollection companyCollection;

    public PegasusManager() {
       this.companyCollection=new CompanyCollection();
       addSeatList();
    }


    private void addSeatList() {
        Seat[] seats=new Seat[]{
                new Seat("A1",SeatType.BUSINESS,true, CompanyType.PEGASUS),
                new Seat("A2",SeatType.BUSINESS,true, CompanyType.PEGASUS),
                new Seat("A3",SeatType.BUSINESS,true, CompanyType.PEGASUS),
                new Seat("B1",SeatType.ECONOMY,true, CompanyType.PEGASUS),
                new Seat("B2",SeatType.ECONOMY,true, CompanyType.PEGASUS),
                new Seat("B3",SeatType.ECONOMY,true, CompanyType.PEGASUS),
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
    public List<Seat> getAllPegasusEmptySeat() {
        return this.companyCollection.getAllPegasusEmptySeats();
    }

    @Override
    public List<Seat> getAllPegasusFullSeat() {
        return this.companyCollection.getAllPegasusFullSeats();
    }

    @Override
    public List<Seat> getAllPegasusSeat() {
        return this.companyCollection.getAllPegasusSeats();
    }

    @Override
    public long countOfPegasusFullSeat() {
        return this.companyCollection.countOfPegasusFullSeat();
    }

    @Override
    public long countOfPegasusEmptySeat() {
        return this.companyCollection.countOfPegasusEmptySeat();
    }

    @Override
    public void foodService(Passenger passenger) {
        if (passenger.getFlightType()== FlightType.ABROAD) {
            System.out.println("Yemek servisimiz mevcuttur.");
        }
        else{
            System.out.println("Yemek servisimiz mevcut değildir.");
        }
    }

    @Override
    public void buyTicket(Seat seat) {
        for (Seat seat1:this.companyCollection.getAllPegasusSeats()){
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
}
