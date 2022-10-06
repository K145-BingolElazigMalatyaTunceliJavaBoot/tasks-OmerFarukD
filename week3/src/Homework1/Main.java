package Homework1;

import Homework1.Business.*;
import Homework1.Entities.Apple;
import Homework1.Entities.Pear;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------APPLE--------------------");
        IAppleService appleService=new AppleManager();
        appleService.add(new Apple(10));
        appleService.buy(5);
        System.out.println( appleService.getByType().unitsInStock());

        System.out.println("--------------------PEAR--------------------");

        IPearService pearService=new PearManager();
        pearService.add(new Pear(8));
        pearService.buy(9);
        System.out.println( pearService.getByType().unitsInStock());

        System.out.println("--------------------CHERRY--------------------");
        ICherryService cherryService=  new CherryManager();
        cherryService.getByType();
    }
}
