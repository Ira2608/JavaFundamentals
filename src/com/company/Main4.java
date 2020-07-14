package com.company;

import java.io.*;
import java.util.Scanner;
//      Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
public class Main4 {
        public static void main(String[] args) {
            Scanner vvod = new Scanner(System.in);
            System.out.print("Введите два целых числа: ");
            for (int i = 0; true; i++) {
                int a = vvod.nextInt();
                int b = vvod.nextInt();

                System.out.println("Sum= " + (a + b));
                System.out.println("Mutli= " + (a * b));
            }
        }
}
