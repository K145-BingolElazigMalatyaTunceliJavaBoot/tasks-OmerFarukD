package Homework1.Rooms;

import Homework1.Entities.Cherry;
import Homework1.Entities.Pear;
import Homework1.Entities.Type;

public class PearRoom extends BaseRoomCollection<Pear> {
    @Override
    public Pear getByType() {
        for (Pear pear:super.getAll()){
            if (pear.getType()== Type.PEAR){
                return pear;
            }
        }
        throw new  NullPointerException("Aradığınız meyve Tipi bulunamadı : "+Type.PEAR);
    }
}
