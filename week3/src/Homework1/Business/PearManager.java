package Homework1.Business;

import Homework1.Entities.Pear;
import Homework1.Rooms.PearRoom;

public class PearManager implements IPearService{
    private PearRoom pearRoom;

    public PearManager() {
        this.pearRoom=new PearRoom();
    }

    @Override
    public Pear add(Pear fruit) {
      return  this.pearRoom.add(fruit);
    }

    @Override
    public Pear getByType() {
        return this.pearRoom.getByType();
    }

    @Override
    public void buy(double kilogram) {
        Pear pear=this.getByType();
        if (pear.unitsInStock()<kilogram) System.out.println("Stoktaki armut limiti aşıldı.");
        else{
            pear.setUnitsInStock(pear.unitsInStock()-kilogram);
            System.out.println("Ürün satın alındı.");
            System.out.println("Ürün tipi: "+pear.getType());
            System.out.println("Stok adedi: "+pear.unitsInStock());
        }
    }
}
