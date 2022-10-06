package Homework1.Rooms;

import Homework1.Entities.Apple;
import Homework1.Entities.Cherry;
import Homework1.Entities.Type;

public class AppleRoom extends BaseRoomCollection<Apple>{
    @Override
    public Apple getByType() {
        for (Apple apple:super.getAll()){
            if (apple.getType()== Type.APPLE){
                return apple;
            }
        }
        throw new  NullPointerException("Aradığınız meyve Tipi bulunamadı : "+Type.APPLE);
    }
}
