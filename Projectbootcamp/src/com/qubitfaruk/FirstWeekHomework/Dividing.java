package com.qubitfaruk.FirstWeekHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * 200 ile 500 arasındaki 3 ile tam bölünen sayılar dışındaki sayıların toplamını bulan program.
 *
 */
public class Dividing {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers= new ArrayList<Integer>();
        List<Integer> notDividedNumbers;
        for (int i=200;i<=500;i++){
            myNumbers.add(i);
        }
        notDividedNumbers=myNumbers.stream().filter(x->isNotDivided(x)).collect(Collectors.toList());
        // 1. yöntem
        notDividedNumbers.forEach(System.out::println);
        int sum=0;
        for (int number:notDividedNumbers){
            sum+=number;
        }
        System.out.println(sum);
        //    2.Yöntem
// ---------------------------------------------------------------------------------------------------
//        AtomicInteger sum1= new AtomicInteger();
//      notDividedNumbers.forEach(x-> sum1.addAndGet(x));
//      System.out.println(sum1);
//----------------------------------------------------------------------------------------------------
    }
    public static boolean isNotDivided(int number){
        if (number %3==0){
            return false;
        }
        return true;
    }
}
