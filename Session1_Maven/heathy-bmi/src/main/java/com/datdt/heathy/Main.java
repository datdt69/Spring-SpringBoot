package com.datdt.heathy;

import com.datdt.heath.core.BMICaculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("BMI Calculator " + new BMICaculator().calculate(70,1.7));

    }
}