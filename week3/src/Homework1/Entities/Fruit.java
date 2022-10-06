package Homework1.Entities;

public abstract class Fruit {
private Type type;
private double unitsInStock;

    public Fruit( double unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double unitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(double unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

}
