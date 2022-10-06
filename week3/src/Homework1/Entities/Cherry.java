package Homework1.Entities;

public class Cherry extends Fruit {

    public Cherry( double unitsInStock) {
        super(unitsInStock);
        super.setType(Type.CHERRY);
    }
}
