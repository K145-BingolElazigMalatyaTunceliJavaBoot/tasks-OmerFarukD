package com.qubitfaruk.SecondWeekHomework.Entities.Concrete;

import com.qubitfaruk.SecondWeekHomework.Entities.Abstract.Car;

public class Sedan extends Car {
    private double dailyRentPrice;
    private double invoiceForMonthly;
    private double invoiceForDaily;

    public Sedan(){
        super.setDailyRent(true);
        super.setMonthlyRent(true);
    }


  public Sedan(double bagageCapacity, int age,double dailyRentPrice){
        super(bagageCapacity,age);
        super.setDailyRent(true);
        super.setMonthlyRent(true);
        this.dailyRentPrice=dailyRentPrice;

  }

    public double invoiceForMonthly() {
        return this.dailyRentPrice +(super.getBagageCapacity()/100+super.age()*30);
    }

    public double invoiceForDaily() {
        return this.dailyRentPrice +(super.getBagageCapacity()/100+super.age());
    }

    public double getDailyRentPrice() {
        return dailyRentPrice;
    }

    public void setDailyRentPrice(double dailyRentPrice) {
        this.dailyRentPrice = dailyRentPrice;
    }
}
