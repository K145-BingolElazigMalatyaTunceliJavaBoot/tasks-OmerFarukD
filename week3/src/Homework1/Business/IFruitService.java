package Homework1.Business;

import java.util.List;

public interface IFruitService<TFruit> {
    TFruit add(TFruit fruit);
    TFruit getByType();
    void buy(double kilogram);
}
