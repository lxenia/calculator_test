package com.levina.test.Input;

import java.util.Scanner;

public class InputOfData {
    public static double firstNumber;
    public static double secondNumber;
    public static char operationSymbol;


    public double input1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");

        if (scanner.hasNextDouble()) {
            firstNumber = scanner.nextDouble();
        } else {
            System.out.println("Неверный ввод");
            input1();
        }
        return firstNumber;
    }


    public double input2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите другое число");
        if (scanner.hasNextDouble()) {
            secondNumber = scanner.nextDouble();
        } else {
            System.out.println("Неверный ввод");
            input2();
        }
        return secondNumber;
    }

    public char inputS() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ математического действия: '+', '-', '*', '/'.");

         if (scanner.hasNext()) {
                operationSymbol = scanner.next().charAt(0);


            } else {
                System.out.println("Неверный ввод.");
                inputS();
            }

            return operationSymbol;

    }
}