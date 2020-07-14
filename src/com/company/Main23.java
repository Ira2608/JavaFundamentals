package com.company;

import java.util.Scanner;

public class Main23 {
//    Отобразить в окне консоли аргументы командной строки в обратном порядке.
    public static void main(String[] args) {
//        Scanner userInputScanner = new Scanner(System.in);
//        System.out.print("Введите цифры");// write your code here
//        String numbers = userInputScanner.nextLine();
//        String reverse = new StringBuffer(numbers).reverse().toString();
//        System.out.println("Строка в обратном порядке, после реверса: " + reverse);
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Введите что-нибудь: ");// write your code here
        String lines = userInputScanner.nextLine();
        StringBuilder stB = new StringBuilder();
        stB.append(lines);
        stB = stB.reverse();       // используем StringBuilder для переворота строки
        System.out.println(stB);

 //       ( Math.random() * (b-a) ) + a
 //         Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        int a = 0; // Начальное значение диапазона - "от"
        int b = 250; // Конечное значение диапазона - "до"
        for (int j = 0; j < 5; j++) {
            int random_number1 = a + (int) (Math.random() * b);
           System.out.println(" " + random_number1);
 //         System.out.print(" " + random_number1);
        }
    }
}

