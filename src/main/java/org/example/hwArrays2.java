package org.example;

import java.util.Arrays;

public class hwArrays2 {
    public static void main(String[] args){
        // 1
        System.out.println("---------1---------");
        int[] arr1 = new int[]{100000, 22222, 12345, 98773, 343434};
        int sum = 0;
        for (int i: arr1){
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // 2
        System.out.println("---------2---------");
        int[] arr2 = new int[]{100000, 22222, 12345, 98773, 343434};
        int min = 1000000000;
        int max = 0;
        for (int i : arr2){
            if (i > max){
                max = i;
            } else if (i < min){
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила "+min+" рублей. Максимальная сумма трат за неделю составила "+max+" рублей");


        // 3
        System.out.println("---------3---------");
        int[] arr3 = new int[]{100000, 22222, 12345, 98773, 343434};
        int sum3 = 0;
        for (int i: arr3){
            sum3 += i;
        }
        sum3 = sum3 / arr3.length;
        System.out.println("Средняя сумма трат за месяц составила " + sum3 + " рублей");

        // 4
        System.out.println("---------4---------");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int lenthOfList = reverseFullName.length - 1;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char firstChar = reverseFullName[i];
            char secondChar = reverseFullName[lenthOfList];
            reverseFullName[i] = secondChar;
            reverseFullName[lenthOfList] = firstChar;
            lenthOfList -= 1;

        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

}

