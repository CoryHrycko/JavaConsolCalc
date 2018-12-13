package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter First digit");
        StringBuilder b = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        double i1 = Double.parseDouble(input1);


        System.out.println("Enter Second Digit");
        String input2 = scanner.nextLine();
        double i2 = Double.parseDouble(input2);


        double result = i1 + i2;
        System.out.println(result);



    }
}
