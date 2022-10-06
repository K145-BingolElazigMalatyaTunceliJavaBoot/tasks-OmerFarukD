package Homework1.Entities;

public class Apple extends Fruit{
    public Apple( double unitsInStock) {
        super(unitsInStock);
        super.setType(Type.APPLE);
    }
}
