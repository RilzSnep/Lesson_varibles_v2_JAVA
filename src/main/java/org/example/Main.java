package org.example;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("=== Задача 1 ===");
        int intVar = 40000;
        byte byteVar = 22;
        short shortVar = 32000;
        long longVar = 1000000000L;
        float floatVar = 3.75f;
        double doubleVar = 123.456;

        System.out.println("Значение переменной intVar с типом int равно " + intVar);
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar);
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar);
        System.out.println("Значение переменной longVar с типом long равно " + longVar);
        System.out.println("Значение переменной floatVar с типом float равно " + floatVar);
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar);

        // Задача 2
        System.out.println("\n=== Задача 2 ===");
        double value1 = 27.12;
        long value2 = 987678965549L;
        float value3 = 2.786f;
        short value4 = 569;
        short value5 = -159;
        int value6 = 27897;
        byte value7 = 67;

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);
        System.out.println("value4 = " + value4);
        System.out.println("value5 = " + value5);
        System.out.println("value6 = " + value6);
        System.out.println("value7 = " + value7);

        // Задача 3
        System.out.println("\n=== Задача 3 ===");
        int studentsLyudmila = 23;
        int studentsAnna = 27;
        int studentsEkaterina = 30;
        int totalPaper = 480;

        int totalStudents = studentsLyudmila + studentsAnna + studentsEkaterina;
        int paperPerStudent = totalPaper / totalStudents;

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        // Задача 4
        System.out.println("\n=== Задача 4 ===");
        int bottlesPer2Minutes = 16;
        int bottlesPerMinute = bottlesPer2Minutes / 2;

        int minutes20 = 20;
        int bottles20Minutes = bottlesPerMinute * minutes20;
        System.out.println("За 20 минут машина произвела " + bottles20Minutes + " штук бутылок");

        int minutesInDay = 24 * 60;
        int bottlesPerDay = bottlesPerMinute * minutesInDay;
        System.out.println("За 1 сутки машина произвела " + bottlesPerDay + " штук бутылок");

        int days3 = 3;
        int bottles3Days = bottlesPerDay * days3;
        System.out.println("За 3 дня машина произвела " + bottles3Days + " штук бутылок");

        int daysInMonth = 30;
        int bottlesPerMonth = bottlesPerDay * daysInMonth;
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        // Задача 5
        System.out.println("\n=== Задача 5 ===");
        int totalCans = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int cansPerClass = whitePerClass + brownPerClass;

        int numberOfClasses = totalCans / cansPerClass;
        int whiteCans = whitePerClass * numberOfClasses;
        int brownCans = brownPerClass * numberOfClasses;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " +
                whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");

        // Задача 6
        System.out.println("\n=== Задача 6 ===");
        int bananasCount = 5;
        int bananaWeight = 80;
        int milkVolume = 200;
        int milkWeightPer100ml = 105;
        int iceCreamCount = 2;
        int iceCreamWeight = 100;
        int eggsCount = 4;
        int eggWeight = 70;

        int totalBananasWeight = bananasCount * bananaWeight;
        int totalMilkWeight = (milkVolume * milkWeightPer100ml) / 100;
        int totalIceCreamWeight = iceCreamCount * iceCreamWeight;
        int totalEggsWeight = eggsCount * eggWeight;

        int totalWeightGrams = totalBananasWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
        double totalWeightKg = totalWeightGrams / 1000.0;

        System.out.println("Вес завтрака: " + totalWeightGrams + " грамм или " + totalWeightKg + " кг");

        // Задача 7
        System.out.println("\n=== Задача 7 ===");
        int weightToLose = 7;
        int minLossPerDay = 250;
        int maxLossPerDay = 500;

        int daysMin = (weightToLose * 1000) / minLossPerDay;
        int daysMax = (weightToLose * 1000) / maxLossPerDay;
        int averageDays = (daysMin + daysMax) / 2;

        System.out.println("При потере 250 грамм в день: " + daysMin + " дней");
        System.out.println("При потере 500 грамм в день: " + daysMax + " дней");
        System.out.println("В среднем потребуется: " + averageDays + " дней");

        // Задача 8
        System.out.println("\n=== Задача 8 ===");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        double raiseMultiplier = 1.10;

        // Маша
        double mashaNewSalary = mashaSalary * raiseMultiplier;
        int mashaAnnualOld = mashaSalary * 12;
        int mashaAnnualNew = (int)(mashaNewSalary * 12);
        int mashaAnnualDifference = mashaAnnualNew - mashaAnnualOld;

        System.out.println("Маша теперь получает " + (int)mashaNewSalary + " рублей. " +
                "Годовой доход вырос на " + mashaAnnualDifference + " рублей");

        // Денис
        double denisNewSalary = denisSalary * raiseMultiplier;
        int denisAnnualOld = denisSalary * 12;
        int denisAnnualNew = (int)(denisNewSalary * 12);
        int denisAnnualDifference = denisAnnualNew - denisAnnualOld;

        System.out.println("Денис теперь получает " + (int)denisNewSalary + " рублей. " +
                "Годовой доход вырос на " + denisAnnualDifference + " рублей");

        // Кристина
        double kristinaNewSalary = kristinaSalary * raiseMultiplier;
        int kristinaAnnualOld = kristinaSalary * 12;
        int kristinaAnnualNew = (int)(kristinaNewSalary * 12);
        int kristinaAnnualDifference = kristinaAnnualNew - kristinaAnnualOld;

        System.out.println("Кристина теперь получает " + (int)kristinaNewSalary + " рублей. " +
                "Годовой доход вырос на " + kristinaAnnualDifference + " рублей");
    }
}
