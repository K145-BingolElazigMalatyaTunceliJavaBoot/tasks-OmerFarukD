package Homework2.Business;

import Homework2.Entities.Passenger;
import Homework2.Entities.Seat;

import java.util.List;

public interface IBaseBusinessService {

    List<Seat> getAllSeats();
    List<Seat> getAllEmptySeats();
    List<Seat> getAllFullSeats();
    void add(Seat seat);

    long countOfFullSeat();
    long countOfEmptySeat();
    long countOfAllSeats();

    void foodService(Passenger passenger);
    void buyTicket(Seat seat);
}
