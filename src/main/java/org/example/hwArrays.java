package org.example;

public class hwArrays {
    public static void main(String[] args) {
        //1
    int[] arr1 = new int[]{1, 2, 3};
    double[] arr2 = new double[]{1.57, 7.654, 9.986};
    double[] arr3 = new double[]{2.59, 12.984, 123.923826};
        // 2
        for (int i = 0; i < arr1.length; i++) {
            if (i != 2) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.print(arr1[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            if (i != 2) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.print(arr2[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            if (i != 2) {
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.print(arr3[i]);
            }
        }
        System.out.println();
        System.out.println("-------------------------------");



        // 3
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.print(arr1[i]);
            }
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.print(arr2[i]);
            }
        }
        System.out.println();

        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.print(arr3[i]);
            }
        }
        System.out.println();
        System.out.println("----------------------------------");
        // 4
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0){
                arr1[i] += 1;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
    }
}
