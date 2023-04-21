package primitivesPack;

/*
-create byte var and set any number byte
- create a short and set a valid short number to it
- create an int var and set any nr to it
- create a long var and make it = to 50k + 10x sum of byte + short + int
 */
public class TemaPrimitives {
    public static void main(String[] args) {
        int myIntVar = 10;
        byte myByteVar = 20;
        short myShortVar = 50;
        long myTotalLong = 50000 + (10 * (myByteVar + myShortVar + myIntVar));
        System.out.println(myTotalLong);

        short shortTotal = (short) (1000 + 10 * (myByteVar + myShortVar + myIntVar));
        System.out.println(shortTotal);
    }
}
