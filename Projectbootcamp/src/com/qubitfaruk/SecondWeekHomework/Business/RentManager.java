package com.qubitfaruk.SecondWeekHomework.Business;

import com.qubitfaruk.SecondWeekHomework.Entities.Concrete.*;

public class RentManager implements IRentService {
    @Override
    public void getList(Customer customer){
        if (customer.getRole()== ROLE.COMPANY){
            System.out.println("Tüm araçlar listelendi.");
        }
        else if (customer.getRole()==ROLE.CITIZEN){
            System.out.println("Sadece Hatchback arabalar listelendi.");
        }
        else {
            System.out.println("Sisteme giriş yapınız.");
        }
    }
    @Override
    public void dailyRent(Customer customer,Suv suv){
        if (customer.getRole()==ROLE.COMPANY){
            if (suv.isDailyRent()){
                System.out.println("(Suv) Şirket hesabından giriş yaptığınız için günlük kiralayabilirsiniz= : "+suv.invoiceForDaily());
            }
            else System.out.println("Araç günlük kiralanamıyor: suv");
        }
        else System.out.println("Şirket hesabından giriş yapmadığınız için kiralayamazsınız.");
    }
    @Override
    public void dailyRent(Customer customer, Hatchback hatchback){
        if (customer.getRole()==ROLE.COMPANY){
            if (hatchback.isDailyRent()){
                System.out.println("(Hatchback)Şirket hesabından giriş yaptığınız için günlük kiralayabilirsiniz= : "+hatchback.invoiceForDaily());
            }
            else System.out.println("Araç günlük kiralanamıyor: hatchback");
        }
        else System.out.println("Şirket hesabından giriş yapmadığınız için kiralayamazsınız.");
    }
    @Override
    public  void dailyRent(Customer customer, Sedan sedan){
if (customer.getRole()==ROLE.CITIZEN || customer.getRole()== ROLE.COMPANY){
    if (sedan.isDailyRent()){
        System.out.println("(Sedan) Giriş yaptığınız için aracı günlük kiralayabilirsiniz."+sedan.invoiceForDaily());
    }
    else{
        System.out.println("Araç günlük kiralanamıyor: Sedan");
    }

}
else System.out.println("Sisteme giriş yapınız.");
    }

    @Override
    public void monthlyRent(Customer customer, Hatchback hatchback) {
        if (customer.getRole()==ROLE.COMPANY){
            if (hatchback.isMonthlyRent()){
                System.out.println("(Hatchback)Şirket hesabından giriş yaptığınız için aylık kiralayabilirsiniz= : "+hatchback.invoiceForMonthly());
            }
            else System.out.println("Araç aylık kiralanamıyor: hatchback");
        }
        else System.out.println("Şirket hesabından giriş yapmadığınız için kiralayamazsınız.");
    }

    @Override
    public void monthlyRent(Customer customer, Sedan sedan) {
        if (customer.getRole() == ROLE.CITIZEN || customer.getRole() == ROLE.COMPANY) {
            if (sedan.isMonthlyRent()) {
                System.out.println("(Sedan) Giriş yaptığınız için aracı aylık kiralayabilirsiniz." + sedan.invoiceForMonthly());
            } else {
                System.out.println("Araç aylık kiralanamıyor: Sedan");
            }
        }
    }
    @Override
    public void monthlyRent(Customer customer, Suv suv) {
        if (customer.getRole()==ROLE.COMPANY){
            if (suv.isMonthlyRent()){
                System.out.println("(Suv) Şirket hesabından giriş yaptığınız için günlük kiralayabilirsiniz= : "+suv.invoiceForMonthly());
            }
            else System.out.println("Araç aylık kiralanamıyor: suv");
        }
        else System.out.println("Şirket hesabından giriş yapmadığınız için kiralayamazsınız.");
    }

}
