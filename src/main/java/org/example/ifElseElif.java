package org.example;

import static javax.management.Query.and;

public class ifElseElif {
    public static void main(String[] args) {
        // 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int age0 = 16;
        if (age0  >= 18) {
            System.out.println("Если возраст человека равен " + age0 + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age0 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }




        // 2
        int temperature1 = 0;
        if (temperature1 < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        int temperature2 = 10;
        if (temperature2 < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }



        //3
        int speed1 = 100;
        if (speed1 >= 60) {
            System.out.println("Если скорость " + speed1 + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed1 + ", то можно ездить спокойно");
        }

        int speed2 = 50;
        if (speed2 >= 60) {
            System.out.println("Если скорость " + speed2 + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed2 + ", то можно ездить спокойно");
        }



        // 4
        int age3 = 3;
        if (age3 >= 2 && age3 <= 6){
            System.out.println("Если возраст человека равен " + age3 + " , то ему нужно ходить в садик");
        } else if (age3 >= 7 && age3 <= 17) {
            System.out.println("Если возраст человека равен " + age3 + " , то ему нужно ходить в школу");
        } else if (age3 >= 18 && age3 <= 24) {
            System.out.println("Если возраст человека равен " + age3 + " , то ему нужно ходить в универ");
        } else {
            System.out.println("Если возраст человека равен \" + age3 + \" , то ему нужно ходить на работу");
        }

        int age4 = 9;
        if (age4 >= 2 && age4 <= 6){
            System.out.println("Если возраст человека равен " + age4 + " , то ему нужно ходить в садик");
        } else if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + " , то ему нужно ходить в школу");
        } else if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + " , то ему нужно ходить в универ");
        } else {
            System.out.println("Если возраст человека равен \" + age3 + \" , то ему нужно ходить на работу");
        }

        int age5 = 19;
        if (age5 >= 2 && age5 <= 6){
            System.out.println("Если возраст человека равен " + age5 + " , то ему нужно ходить в садик");
        } else if (age5 >= 7 && age5 <= 17) {
            System.out.println("Если возраст человека равен " + age5 + " , то ему нужно ходить в школу");
        } else if (age5 >= 18 && age5 <= 24) {
            System.out.println("Если возраст человека равен " + age5 + " , то ему нужно ходить в универ");
        } else {
            System.out.println("Если возраст человека равен \" + age3 + \" , то ему нужно ходить на работу");
        }

        int age6 = 26;
        if (age6 >= 2 && age6 <= 6){
            System.out.println("Если возраст человека равен " + age6 + " , то ему нужно ходить в садик");
        } else if (age6 >= 7 && age6 <= 17) {
            System.out.println("Если возраст человека равен " + age6 + " , то ему нужно ходить в школу");
        } else if (age6 >= 18 && age6 <= 24) {
            System.out.println("Если возраст человека равен " + age6 + " , то ему нужно ходить в универ");
        } else {
            System.out.println("Если возраст человека равен " + age6 + " , то ему нужно ходить на работу");
        }



        // 5
        int age1 = 3;
        if (age1 < 5) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему нельзя кататься на аттракционе");
        } else if (age1 >= 5 && age1 < 14) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int age2 = 7;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе");
        } else if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int age7 = 15;
        if (age7 < 5) {
            System.out.println("Если возраст ребенка равен " + age7 + ", то ему нельзя кататься на аттракционе");
        } else if (age7 >= 5 && age7 < 14) {
            System.out.println("Если возраст ребенка равен " + age7 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age7 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }



        // 6
        int totalCapacity = 102;
        int sittingSeats = 60;


        int passengers1 = 25;
        if (passengers1 < sittingSeats) {
            System.out.println("При " + passengers1 + " пассажирах есть сидячие и стоячие места");
        } else if (passengers1 < totalCapacity) {
            System.out.println("При " + passengers1 + " пассажирах есть только стоячие места");
        } else {
            System.out.println("При " + passengers1 + " пассажирах вагон полностью забит");
        }


        int passengers2 = 75;
        if (passengers2 < sittingSeats) {
            System.out.println("При " + passengers2 + " пассажирах есть сидячие и стоячие места");
        } else if (passengers2 < totalCapacity) {
            System.out.println("При " + passengers2 + " пассажирах есть только стоячие места");
        } else {
            System.out.println("При " + passengers2 + " пассажирах вагон полностью забит");
        }


        int passengers3 = 102;
        if (passengers3 < sittingSeats) {
            System.out.println("При " + passengers3 + " пассажирах есть сидячие и стоячие места");
        } else if (passengers3 < totalCapacity) {
            System.out.println("При " + passengers3 + " пассажирах есть только стоячие места");
        } else {
            System.out.println("При " + passengers3 + " пассажирах вагон полностью забит");
        }


        int passengers4 = 60;
        if (passengers4 < sittingSeats) {
            System.out.println("При " + passengers4 + " пассажирах есть сидячие и стоячие места");
        } else if (passengers4 < totalCapacity) {
            System.out.println("При " + passengers4 + " пассажирах есть только стоячие места");
        } else {
            System.out.println("При " + passengers4 + " пассажирах вагон полностью забит");
        }



        // 7
        int one1 = 15;
        int two1 = 8;
        int three1 = 10;
        if (one1 >= two1 && one1 >= three1) {
            System.out.println("Наибольшее число: " + one1);
        } else if (two1 >= one1 && two1 >= three1) {
            System.out.println("Наибольшее число: " + two1);
        } else {
            System.out.println("Наибольшее число: " + three1);
        }

        int one2 = 5;
        int two2 = 12;
        int three2 = 7;
        if (one2 >= two2 && one2 >= three2) {
            System.out.println("Наибольшее число: " + one2);
        } else if (two2 >= one2 && two2 >= three2) {
            System.out.println("Наибольшее число: " + two2);
        } else {
            System.out.println("Наибольшее число: " + three2);
        }

        int one3 = 3;
        int two3 = 6;
        int three3 = 9;
        if (one3 >= two3 && one3 >= three3) {
            System.out.println("Наибольшее число: " + one3);
        } else if (two3 >= one3 && two3 >= three3) {
            System.out.println("Наибольшее число: " + two3);
        } else {
            System.out.println("Наибольшее число: " + three3);
        }

        int one4 = 7;
        int two4 = 7;
        int three4 = 7;
        if (one4 >= two4 && one4 >= three4) {
            System.out.println("Наибольшее число: " + one4);
        } else if (two4 >= one4 && two4 >= three4) {
            System.out.println("Наибольшее число: " + two4);
        } else {
            System.out.println("Наибольшее число: " + three4);
        }
    }
}
