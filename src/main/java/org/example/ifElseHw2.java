package org.example;

public class ifElseHw2 {
    public static void main(String[] args){
        // 1
        System.out.println("-----------1------------");
        int clientOS1 = 0;
        int clientOS2 = 1;

        if (clientOS1 == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        if (clientOS2 == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        // 2
        System.out.println("-----------2------------");
        int clientOS3 = 0;
        int clientOS4 = 0;
        int clientOS5 = 1;
        int clientOS6 = 1;
        int clientYear3 = 2010;
        int clientYear4 = 2020;
        int clientYear5 = 2010;
        int clientYear6 = 2020;

        if (clientOS3 == 0 && clientYear3 > 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS3 == 0 && clientYear3 <= 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS3 == 1 && clientYear3 > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        if (clientOS4 == 0 && clientYear4 > 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS4 == 0 && clientYear4 <= 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS4 == 1 && clientYear4 > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        if (clientOS5 == 0 && clientYear5 > 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS5 == 0 && clientYear5 <= 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS5 == 1 && clientYear5 > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        if (clientOS6 == 0 && clientYear6 > 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS6 == 0 && clientYear6 <= 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS6 == 1 && clientYear6 > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        // 3
        System.out.println("-----------3-----------");
        int year1 = 1000;
        int year2 = 1900;
        int year3 = 2000;
        int year4 = 2024;

        if (year1 > 1584 && (year1 % 4 == 0) && (year1 % 100 != 0 || year1 % 400 == 0)){
            System.out.println(year1 + " год является високосным");
        } else {
            System.out.println(year1 + " год не является високосным");
        }

        if (year2 > 1584 && (year2 % 4 == 0) && (year2 % 100 != 0 || year2 % 400 == 0)){
            System.out.println(year2 + " год является високосным");
        } else {
            System.out.println(year2 + " год не является високосным");
        }

        if (year3 > 1584 && (year3 % 4 == 0) && (year3 % 100 != 0 || year3 % 400 == 0)){
            System.out.println(year3 + " год является високосным");
        } else {
            System.out.println(year3 + " год не является високосным");
        }

        if (year4 > 1584 && (year4 % 4 == 0) && (year4 % 100 != 0 || year4 % 400 == 0)){
            System.out.println(year4 + " год является високосным");
        } else {
            System.out.println(year4 + " год не является високосным");
        }

        // 4
        System.out.println("---------4---------");
        int testDistance1 = 15;
        if (testDistance1 <= 20) {
            System.out.println("Для " + testDistance1 + " км потребуется дней: 1");
        } else if (testDistance1 <= 60) {
            System.out.println("Для " + testDistance1 + " км потребуется дней: 2");
        } else if (testDistance1 <= 100) {
            System.out.println("Для " + testDistance1 + " км потребуется дней: 3");
        } else {
            System.out.println("Для " + testDistance1 + " км доставки нет");
        }

        int testDistance2 = 45;
        if (testDistance2 <= 20) {
            System.out.println("Для " + testDistance2 + " км потребуется дней: 1");
        } else if (testDistance2 <= 60) {
            System.out.println("Для " + testDistance2 + " км потребуется дней: 2");
        } else if (testDistance2 <= 100) {
            System.out.println("Для " + testDistance2 + " км потребуется дней: 3");
        } else {
            System.out.println("Для " + testDistance2 + " км доставки нет");
        }

        int testDistance3 = 150;
        if (testDistance3 <= 20) {
            System.out.println("Для " + testDistance3 + " км потребуется дней: 1");
        } else if (testDistance3 <= 60) {
            System.out.println("Для " + testDistance3 + " км потребуется дней: 2");
        } else if (testDistance3 <= 100) {
            System.out.println("Для " + testDistance3 + " км потребуется дней: 3");
        } else {
            System.out.println("Для " + testDistance3 + " км доставки нет");
        }


        // 5
        System.out.println("------------5-----------");
        int monthNumber = 12;

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Ошибка: номер месяца должен быть от 1 до 12");
            return;
        }

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону: зима" );
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону: весна" );
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону: лето" );
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону: осень");
                break;
            default:
                System.out.println("неизвестный сезон");

        }
    }
}
