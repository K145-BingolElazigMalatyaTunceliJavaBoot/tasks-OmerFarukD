package Homework2.Collections;

import Homework2.Entities.CompanyType;
import Homework2.Entities.Seat;
import Homework2.Entities.SeatType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompanyCollection {

   private   List<Seat>  seats;

    public CompanyCollection() {
        this.seats=new ArrayList<>();
    }

    public void addSeats(Seat seat){
        this.seats.add(seat);
    }

    public List<Seat> getAllSeats(){
        return this.seats;
    }

    public List<Seat> getAllPegasusSeats(){
        return this.seats.stream().filter(this::pegasusTypeController).toList();
    }
    public List<Seat> getAllPegasusEmptySeats(){
        return this.seats.stream().filter(this::pegasusTypeController).filter(this::emptyController).toList();
    }

    public List<Seat> getAllFullSeats(){
        return this.seats.stream().filter(x->! emptyController(x)).toList();
    }
    public List<Seat> getAllTHYSeats(){
        return this.seats.stream().filter(this::thyTypeController).toList();
    }
    public List<Seat> getAllTHYEmptySeats(){
        return this.seats.stream().filter(this::thyTypeController).filter(this::emptyController).toList();
    }

    public List<Seat> getAllPegasusFullSeats(){
        return this.seats.stream().filter(this::pegasusTypeController).filter(x-> !emptyController(x)).toList();
    }

    public List<Seat> getAllTHYFullSeats(){
        return this.seats.stream().filter(this::thyTypeController).filter(x-> !emptyController(x)).toList();
    }

    public List<Seat> getAllEmptySeats(){
        return this.seats.stream().filter(this::emptyController).toList();
    }
   public long countOfPegasusEmptySeat(){
        return this.seats.stream().filter(this::emptyController).filter(this::pegasusTypeController).count();
    }
   public long countOfTHYEmptySeat(){
        return this.seats.stream().filter(this::emptyController).filter(this::thyTypeController).count();
    }
   public long countOfPegasusFullSeat(){
        return this.seats.stream().filter(this::pegasusTypeController).filter(x-> !emptyController(x)).count();
    }
   public long countOfTHYFullSeat(){
        return this.seats.stream().filter(this::thyTypeController).filter(x-> !emptyController(x)).count();
   }
   public long countOfAllSeat(){
        return this.seats.stream().count();
   }
   public long countOfAllEmpty(){
        return this.seats.stream().filter(this::emptyController).count();
   }
    // predicate (lambda) controllers

    private boolean pegasusTypeController(Seat seat){
        return seat.getCompanyType() == CompanyType.PEGASUS;
    }

    private boolean thyTypeController(Seat seat){
        return seat.getCompanyType() == CompanyType.THY;
    }

    private boolean emptyController(Seat seat){
        return seat.isEmpty();
    }
}
