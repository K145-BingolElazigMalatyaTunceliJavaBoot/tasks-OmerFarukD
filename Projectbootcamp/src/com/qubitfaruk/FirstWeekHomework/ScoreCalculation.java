package com.qubitfaruk.FirstWeekHomework;

import java.util.Random;

/**
 * Okul puanlarının harf karşılığını yazan program.
 * Random alınabilir değerler.
 * 0 - 35 arası FF
 * 35 - 50 arası DC
 * 50 - 70 arası BB
 * 70 - 100 arası AA
 */
public class ScoreCalculation {
    public static void main(String[] args) {
        Random random=new Random();
        short sayi=(short) random.nextInt(100);
        System.out.println("Puanınız: "+sayi);
        System.out.println("Harf notunuz : "+score(sayi));
    }

    public static String score(short point){
       if (point>=0 && point<35)
           return "FF";
       else if (point>35 && point<=50)
           return "DC";
       else if (point>50 && point<=70)
           return "BB";
       else if (point>70 && point<=100)
           return "AA";
       else
           return "Geçersiz sayı girdiniz";
    }
}
