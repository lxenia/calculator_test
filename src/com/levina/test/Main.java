package com.levina.test;

import com.levina.test.Calculation.Logic;
import com.levina.test.Calculation.Logic2;
import com.levina.test.Input.InputOfData;

public class Main {

    public static void main(String[] args) {

            InputOfData instanceOfInputOfData = new InputOfData();
            instanceOfInputOfData.input1();
            instanceOfInputOfData.input2();
            instanceOfInputOfData.inputS();

            Logic instanceOfLogic = new Logic();
            instanceOfLogic.logic();

            Logic2 instanceOfLogic2 = new Logic2();
            instanceOfLogic2.logic2();

    }
}