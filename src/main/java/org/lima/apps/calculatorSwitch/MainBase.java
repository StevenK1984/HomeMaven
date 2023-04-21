package org.lima.apps.calculatorSwitch;

import java.util.Scanner;

public class MainBase {

    public static void main(String[] args) {

        OperationsCalc oc = new OperationsCalc();

        //ask user for inputs
        Scanner x = new Scanner(System.in);
        int[] userNumbers = new int[2]; //size 2 numbers

        //...throw them into a set length array one by one
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            userNumbers[i] = x.nextInt();
        }
        int a = userNumbers[0];
        int b = userNumbers[1];

        //ask user for desired operation to be triggered
        System.out.println("Choose an action (Hint: +, -, *, /, %, ^) : ");
        char operator = x.next().charAt(0);

        double result = 0;
        switch (operator) {

            case '+':
                result = oc.operationalPlus(a,b);
                break;

            case '-':
                result = oc.operationalMinus(a,b);
                break;

            case '*':
                result = oc.operationalMultiply(a,b);
                break;

            case '/':
                result = oc.operationalDivide(a,b);
                break;

            case '%':
                result = oc.operationalModulus(a,b);
                break;

            case '^':
                result = oc.powerUp(a,b);
                break;
        }

        if (result < 0){
            String str = Double.toString(result);
            System.out.println("Your result is: " + str); // de ce nu merge ??
        } else if (result > 0) {
            System.out.println("Your result is: " + result);
        }
        x.close();


    }
}
