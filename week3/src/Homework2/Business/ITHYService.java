package Homework2.Business;

import Homework2.Entities.Seat;

import java.util.List;

public interface ITHYService extends  IBaseBusinessService{
    List<Seat> getAllTHYEmptySeat();
    List<Seat> getAllTHYFullSeat();
    List<Seat> getAllTHYSeat();
    long countOfTHYFullSeat();
    long countOfTHYEmptySeat();
}
