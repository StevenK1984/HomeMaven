package org.lima.apps.calculatorSwitch;

import lombok.Getter;

@Getter
public class OperationsCalc {

    private int value_one;
    private int value_two;
    private double nrExpo;
    private double nrBaza;

    public double powerUp(double basic, double exponential) {
        this.nrBaza = basic;
        this.nrExpo = exponential;

        double temp = 1;
        for (int i = 0; i <= exponential; i++){
            temp = temp * basic;
        }
        return temp;
    }


    public int operationalPlus(int firstValue, int secondValue){
        this.value_one = firstValue;
        this.value_two = secondValue;
        return firstValue + secondValue;
    }

    public int operationalMinus(int firstValue,int secondValue){
        this.value_one = firstValue;
        this.value_two = secondValue;
        return firstValue - secondValue;
    }

    public int operationalMultiply(int firstValue,int secondValue){
        this.value_one = firstValue;
        this.value_two = secondValue;
        return firstValue * secondValue;
    }

    public int operationalDivide(int firstValue,int secondValue){
        this.value_one = firstValue;
        this.value_two = secondValue;
        return firstValue / secondValue;
    }

    public int operationalModulus(int firstValue,int secondValue){
        this.value_one = firstValue;
        this.value_two = secondValue;
        return firstValue % secondValue;
    }



}


