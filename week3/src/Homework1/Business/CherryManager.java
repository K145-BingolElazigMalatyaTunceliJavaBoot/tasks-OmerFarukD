package Homework1.Business;

import Homework1.Entities.Apple;
import Homework1.Entities.Cherry;
import Homework1.Rooms.AppleRoom;
import Homework1.Rooms.CherryRoom;

public class CherryManager implements ICherryService{
    private CherryRoom cherryRoom;
    public CherryManager() {
        this.cherryRoom=new CherryRoom();
    }

    @Override
    public Cherry add(Cherry cherry) {
        return this.cherryRoom.add(cherry);
    }
    @Override
    public Cherry getByType() {
        return this.cherryRoom.getByType();
    }
    @Override
    public void buy(double kilogram) {
        Cherry cherry=this.getByType();
        if (cherry.unitsInStock()<kilogram) System.out.println("Stoktaki Kiraz limiti aşıldı.");
        else{
            cherry.setUnitsInStock(cherry.unitsInStock()-kilogram);
            System.out.println("Ürün satın alındı.");
            System.out.println("Ürün tipi: "+cherry.getType());
            System.out.println("Stok adedi: "+cherry.unitsInStock());
        }
    }
}
