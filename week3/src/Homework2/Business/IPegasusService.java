package Homework2.Business;

import Homework2.Entities.Passenger;
import Homework2.Entities.Seat;

import java.util.List;

public interface IPegasusService extends  IBaseBusinessService{
     List<Seat> getAllPegasusEmptySeat();
     List<Seat> getAllPegasusFullSeat();
     List<Seat> getAllPegasusSeat();
     long countOfPegasusFullSeat();
     long countOfPegasusEmptySeat();

}
