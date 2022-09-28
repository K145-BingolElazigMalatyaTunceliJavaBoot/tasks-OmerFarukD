package com.qubitfaruk.SecondWeekHomework.Entities.Abstract;



public  class Car {
  private   boolean isDailyRent;
  private boolean isMonthlyRent;
  private double bagageCapacity;
    private int age;
    public Car() {
    }

    public Car( double bagageCapacity, int age) {
        this.bagageCapacity = bagageCapacity;
        this.age = age;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public double getBagageCapacity() {
        return bagageCapacity;
    }

    public void setBagageCapacity(double bagageCapacity) {
        this.bagageCapacity = bagageCapacity;
    }


    public boolean isDailyRent() {
        return isDailyRent;
    }

    public void setDailyRent(boolean dailyRent) {
        isDailyRent = dailyRent;
    }

    public boolean isMonthlyRent() {
        return isMonthlyRent;
    }

    public void setMonthlyRent(boolean monthlyRent) {
        isMonthlyRent = monthlyRent;
    }

}
