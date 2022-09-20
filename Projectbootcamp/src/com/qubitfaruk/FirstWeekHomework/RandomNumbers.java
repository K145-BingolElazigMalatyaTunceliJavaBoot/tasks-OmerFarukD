package com.qubitfaruk.FirstWeekHomework;

import java.util.Random;

/**
 * 0 ile 500 aralığında ve
 * Bu sayılardan 50 ile 100 arasında bir sayı bulunana kadar rastgele sayılar seçilir.
 * 50 ile 100 arasındaki sayının kaçıncı seçimde bulunduğunu bulan program.
 */
public class RandomNumbers {
    public static void main(String[] args) {
var random=new Random();
int randomSayi = 0;
int sayac=0;
boolean isTrue=true;
while (isTrue){
    sayac++;
     randomSayi=random.nextInt(500);
    if (randomSayi>50 && randomSayi<100){
        isTrue=false;
    }
}
        System.out.println(sayac + ". seferde buldu");
        System.out.println("Sayı : "+randomSayi);
    }
}
