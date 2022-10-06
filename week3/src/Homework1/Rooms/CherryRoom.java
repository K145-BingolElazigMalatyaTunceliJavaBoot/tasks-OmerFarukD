package Homework1.Rooms;

import Homework1.Entities.Cherry;
import Homework1.Entities.Type;

public class CherryRoom extends BaseRoomCollection<Cherry> {

    @Override
    public Cherry getByType() {
        for (Cherry cherry:super.getAll()){
            if (cherry.getType()==Type.CHERRY){
                return cherry;
            }
        }
        throw new  NullPointerException("Aradığınız meyve Tipi bulunamadı : "+Type.CHERRY);
    }
}
