package primitivesPack;

public class ByteShortie {

    public static void main(String[] args) {

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Max Value = " + myMaxByteValue);
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);
        System.out.println("Byte Min Value = " + myMinByteValue);
        //"-----------"
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("myMinShortValue = " + myMinShortValue);
        System.out.println("myMaxShortValue = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("myMinLongValue = " + myMinLongValue);
        System.out.println("myMaxLongValue = "+ myMaxLongValue);

        long myLongValue = 100;
        long bigLongLiteralValue = 2_147_483_647_284L;
        System.out.println(bigLongLiteralValue);
        short myBigShortValue = 32767;
        /*
        short > 16 bits
        int > 32 bits
         */
        int myMinIntValue = java.lang.Integer.MIN_VALUE;
        int myMaxIntValue = java.lang.Integer.MAX_VALUE;

        int myTotal = (myMinIntValue /2);
        byte myNewByteValue = (byte)(myMinByteValue /2);
        System.out.println(myTotal);
        short myNewShortie = (short)(myMinShortValue /2);
    }
}
