package org.example;

public class methods {
    public static void main(String[] args){
        isYearLeap(2024);
        typeOfOsForPhones(1, 2023);
        String answer = deliveryToUser(30);
        System.out.println(answer);


    }

    public static void isYearLeap(int year){
        if (year > 1584 && (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void typeOfOsForPhones(int num, int year){
        if (num == 0 && year > 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (num == 0 && year <= 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (num == 1 && year > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static String deliveryToUser(int distance){
        if (distance <= 20) {
            return ("Для " + distance + " км потребуется дней: 1");
        } else if (distance <= 60) {
            return ("Для " + distance + " км потребуется дней: 2");
        } else if (distance <= 100) {
            return ("Для " + distance + " км потребуется дней: 3");
        } else {
            return ("Для " + distance + " км доставки нет");
        }
    }
}
