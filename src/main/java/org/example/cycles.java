package org.example;

public class cycles {
    public static void main(String [] args){

        // 1
        System.out.println("-----------1------------");
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        // 2
        System.out.println("-----------2------------");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        // 3
        System.out.println("-----------3------------");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        // 4
        System.out.println("-----------4------------");
        for (int i = -10; i <= 10; i++) {
            System.out.println(i);
        }

        // 5
        System.out.println("-----------5------------");
        for (int i = 1094; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        // 6
        System.out.println("-----------6------------");
        for (int i = 7; i <= 98; i+=7) {
            System.out.println(i);
        }


        // 7
        System.out.println("-----------7------------");
        for (int i = 1; i <= 512; i*=2) {
            System.out.println(i);
        }


        // 8
        System.out.println("-----------8------------");
        for (int month = 1, total = 0; month <= 12; month++) {
            total += 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }



        // 9
        System.out.println("----------9------------");
        for (int month = 1; month <= 12; month++) {
            double total = 29000 * month * Math.pow(1.01, month);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (int)total + " рублей");
        }


        // 10
        System.out.println("-----------10------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }

    }
}
