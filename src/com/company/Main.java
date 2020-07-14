package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Как вас зовут? ");// write your code here
        String yourName = userInputScanner.nextLine();
        System.out.println("Hello, " + yourName + "!");
    }
}
