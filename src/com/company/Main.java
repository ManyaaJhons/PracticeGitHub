package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      public class dzMassivy {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = r.nextInt(6);
            System.out.print(array[i] + " ");
        }
        int Max = array[0];
        int MaxOfIndex = 0;
        for (int i = 1; i < 10; i++){
            if (array[i] > Max){

                Max = array[i];
                MaxOfIndex = i;
            }
        }
        System.out.println(Max + " array [" + MaxOfIndex + "] = ");
        int Min = array[0];
        int MinOfIndex = 0;
        for (int i = 1; i< 10; i++){
            if(array[i] < Min){
                Min = array[i];
                MinOfIndex = i;
            }
        }

        System.out.println(Min + "array [" + MinOfIndex + "]");


        // 2- задание
        Random r = new Random();
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = r.nextInt(6);
            System.out.print(array[i] + " ");
        }
        int Max = array[0];
        int NumberOfMax = 0;
        for (int i = 1; i < 10; i++){
            if (array[i] > Max){

                Max = array[i];


            }
        }
        System.out.println("\nмаксимальное число равен " + Max     );
        int Min = array[0];
        int NumberOfMin = 0;
        for (int i = 1; i< 10; i++){
            if(array[i] < Min){
                Min = array[i];


            }
        }

        System.out.println("минимальное число равен " + Min  );


        for (int i = 0; i < 10; i++){
            if(Max == array[i]){
                NumberOfMax++;

            }
            if(Min == array[i]){
                NumberOfMin++;
            }
        }

        System.out.println(NumberOfMax);
        System.out.println(NumberOfMin);
        }
    }
    }
}
