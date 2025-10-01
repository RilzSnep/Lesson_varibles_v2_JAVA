package org.example;

public class cycles {
    public static void main(String [] args){

        // 1
        System.out.println("-----------1------------");
        int mounth = 0;
        int money = 0;
        while (money < 2459000){
            mounth++;
            money += 15000;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна: " + money + " рублей.");
        }

        // 2
        System.out.println("-----------2------------");
        int nummber = 1;
        while (nummber <= 10){
            System.out.print(nummber+" ");
            nummber++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
        // 3
        System.out.println("-----------3------------");
        int population = 12_000_000;
        int fertilityPerYear = 9;
        int fertility = population / 1000 * fertilityPerYear;
        for (int i = 0; i < 10; i++) {
            fertility = population / 1000 * fertilityPerYear;
            population += fertility;
            System.out.println("Год " + i + ", численность населения составляет "+ population);
        }
        // 4
        System.out.println("-----------4------------");
        int total = 15000;
        int mounth2 = 0;
        while (total < 12000000){
            total *= 1.07;
            mounth2++;
            System.out.println("Месяц " +mounth2+ ", накоплено " +total);
        }

        // 5
        System.out.println("-----------5------------");
        int total3 = 15000;
        int mounth3 = 0;
        while (total3 < 12000000){
            total3 *= 1.07;
            mounth3++;
            if (mounth3 % 3 ==0){
                System.out.println("Месяц " +mounth3+ ", накоплено " +total3);
            }
        }

        // 6
        System.out.println("-----------6------------");
        int total4 = 15000;
        int mounth4 = 0;
        while (mounth4 < 108){
            total4 *= 1.07;
            mounth4++;
            if (mounth4 % 6 == 0){
                System.out.println("Месяц " +mounth4+ ", накоплено " +total4);
            }
        }


        // 7
        System.out.println("-----------7------------");
        int firstFriday = 3; // первая пятница месяца выпадает на 3 число

        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }


            // 8
        System.out.println("-----------8------------");
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        for (int year = 0; year <= endYear; year += 79) {
            if (year >= startYear) {
                System.out.println(year);
            }
        }
    }
}
