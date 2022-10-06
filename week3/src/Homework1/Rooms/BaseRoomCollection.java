package Homework1.Rooms;



import Homework1.Entities.Fruit;
import Homework1.Entities.Type;

import java.util.ArrayList;
import java.util.List;

public abstract class  BaseRoomCollection<TFruit> {

    List<TFruit> fruits;

    public BaseRoomCollection() {
        this.fruits=new ArrayList<>();
    }
    public TFruit add(TFruit fruit){
        this.fruits.add(fruit);
        return  fruit;
    }
    public List<TFruit> getAll(){
        return this.fruits;
    }

    public abstract TFruit getByType();
}
