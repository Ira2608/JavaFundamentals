package com.company;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12, чтобы узнать месяц: ");// write your code here
        int Num = scan.nextInt();
        System.out.println(solve(Num));
    }
    public static String solve(int Num){
        String[] month = {"","Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        if(Num > 0 && Num<month.length) return month[Num];
        return "Month not found";
    }

}
