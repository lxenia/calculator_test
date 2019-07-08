package com.levina.test.Calculation;

import com.levina.test.Input.InputOfData;

import java.util.Scanner;

public class Logic2 {
    InputOfData input = new InputOfData();
    Logic logic = new Logic();

    public void logic2 () {
        System.out.println("Для выхода из программы нажмите 'e'");
        System.out.println("Для совершения нового вычисления нажмите 'c'");
        System.out.println("Для продолжения вычисления введите другое число");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                input.firstNumber = logic.result;
                input.secondNumber = scanner.nextDouble();
                input.inputS();
                logic.logic();
                logic2();
            }
        else {
            char sign = scanner.next().charAt(0);
            if (sign == 'c') {
                input.input1();
                input.input2();
                input.inputS();
                logic.logic();
                logic2();
            } else if (sign == 'e') {
                System.exit(0);
            } else {
                System.out.println("Неверный ввод");
                input.input2();
                input.inputS();
                logic.logic();
                logic2();
            }
            }
        }
    }
}
