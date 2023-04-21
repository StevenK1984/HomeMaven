package primitivesPack;

public class Integer {
    public static void main(String[] args) {
        int myValue = 10;
        int myMinValue = java.lang.Integer.MIN_VALUE;
        int myMaxValue = java.lang.Integer.MAX_VALUE;
        System.out.println("primitivesPack.Integer Min Value = " + myMinValue);
        System.out.println("primitivesPack.Integer Max Value = " + myMaxValue);
        //Exceed max/min values => Overflow
        System.out.println("Busted Max value = " + (myMaxValue +1));
        System.out.println("Busted Min value = " + (myMinValue -1));

        int myMaxInttest = 2_147_483_647;
    }
}
