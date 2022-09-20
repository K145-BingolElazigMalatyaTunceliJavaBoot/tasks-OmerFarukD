package com.qubitfaruk.FirstWeekHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * 3 ile 100 arasında asal sayıların toplamını bulan program.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        ArrayList<Short> myNumber=new ArrayList<Short>();
        List<Short> primeNumbers;
        int sayi=0;
        for (short i=3;i<=100;i++){
            myNumber.add(i);
        }
        primeNumbers=  myNumber.stream().filter(x->isPrime(x)).collect(Collectors.toList());

        //1. yöntem
        for(short number:primeNumbers){
            sayi+=number;
            System.out.println(number);
        }

        System.out.println("3 ile 100 arasındaki asal sayıların toplamı : "+sayi);

        //2. yöntem
//         AtomicInteger sum1=new AtomicInteger();
//      primeNumbers.forEach(sum1::addAndGet);
//       System.out.println("2. yöntem : "+sum1);
    }
    public static boolean isPrime (short number){
        for (int i=2 ; i<number;i++){
            if (number %i==0){
                return false;
            }
        }
        return true;
    }
}
