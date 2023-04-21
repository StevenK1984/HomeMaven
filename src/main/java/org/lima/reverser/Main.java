package org.lima.reverser;

public class Main {
    public static void main(String[] args)
    {
        Cheese myCheese = new Cheese();
        myCheese.setLevelOfStinkiness(10);

        System.out.println("---");
        increaseStinkiness(myCheese);
        System.out.println("---");
        System.out.println(myCheese.getLevelOfStinkiness());
        System.out.println("---");
        increaseStinkiness(myCheese);
    }

    private static void increaseStinkiness(Cheese cheese){
        cheese.setLevelOfStinkiness(cheese.getLevelOfStinkiness() +1);
    }
}