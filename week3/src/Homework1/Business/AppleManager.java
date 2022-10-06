package Homework1.Business;

import Homework1.Entities.Apple;
import Homework1.Rooms.AppleRoom;



public class AppleManager implements IAppleService{
   private AppleRoom appleRoom;
    public AppleManager() {
        this.appleRoom=new AppleRoom();
    }


    @Override
    public Apple add(Apple apple) {
        return this.appleRoom.add(apple);
    }

    @Override
    public Apple getByType() {
        return this.appleRoom.getByType();
    }

    @Override
    public void buy(double kilogram) {
        Apple apple=this.getByType();
       if (apple.unitsInStock()<kilogram) System.out.println("Stoktaki elma limiti aşıldı.");
       else{
           apple.setUnitsInStock(apple.unitsInStock()-kilogram);
           System.out.println("Ürün satın alındı.");
           System.out.println("Ürün tipi: "+apple.getType());
           System.out.println("Stok adedi: "+apple.unitsInStock());
       }
    }
}
