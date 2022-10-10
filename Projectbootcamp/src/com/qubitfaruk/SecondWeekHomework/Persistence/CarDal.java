package com.qubitfaruk.SecondWeekHomework.Persistence;

import com.qubitfaruk.SecondWeekHomework.Entities.Abstract.Car;

import java.util.ArrayList;
import java.util.List;

public abstract class CarDal<TEntity> {
    List<TEntity> cars;

    public CarDal() {
        this.cars=new ArrayList<TEntity>();
    }

    public  List<TEntity> getAll(){
        return this.cars;
    }
    public TEntity add(TEntity entity){
        this.cars.add(entity);
        return entity;
    }
}
