package com.levina.test.Calculation;

import com.levina.test.Input.InputOfData;

public class Logic {
    public static double result;
    InputOfData instanceOfInputOfData = new InputOfData();


    public double logic() {

        switch (InputOfData.operationSymbol) {
            case '+':
                result = InputOfData.firstNumber + InputOfData.secondNumber;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = InputOfData.firstNumber - InputOfData.secondNumber;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = InputOfData.firstNumber * InputOfData.secondNumber;
                System.out.println("Результат: " + result);
                break;
            case '/':
                result = InputOfData.firstNumber / InputOfData.secondNumber;
                System.out.println("Результат: " + result);
                break;

            default:
                System.out.println("Результат: невозможно выполнить операцию");
        }

        return result;
    }
}
