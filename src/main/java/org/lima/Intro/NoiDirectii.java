package Intro;

public class NoiDirectii {
    public static void main(String[] args) {
//        double a = 1.0;
//        double b = 0.0;
//
//        System.out.println((a / b)); // infinity

//        double negative_inf=Double.NEGATIVE_INFINITY;
//        double positive_inf=Double.POSITIVE_INFINITY;
//        System.out.println(negative_inf);
//        System.out.println("---");
//        System.out.println(positive_inf-negative_inf); //Infinity
//        System.out.println(negative_inf-positive_inf); //-Infinity
//        System.out.println(positive_inf+negative_inf); //NaN (Not a number)

        //----//
        // An example of overflow:
        double d = 1e308;
        System.out.print("overflow produces infinity: ");
        System.out.println(d + "*10==" + d*10);
// An example of gradual underflow:
        d = 1e-305 * Math.PI;
        System.out.print("gradual underflow: " + d + "\n ");
        for (int i = 0; i < 4; i++)
            System.out.print(" " + (d /= 100000));
        System.out.println();
// An example of NaN:
        System.out.print("0.0/0.0 is Not-a-Number: ");
        d = 0.0/0.0;
        System.out.println(d);
// An example of inexact results and rounding:
        System.out.print("inexact results with float:");
        for (int i = 0; i < 100; i++) {
            float z = 1.0f / i;
            if (z * i != 1.0f)
                System.out.print(" " + i);
        }
        System.out.println();
// Another example of inexact results and rounding:
        System.out.print("inexact results with double:");
        for (int i = 0; i < 100; i++) {
            double z = 1.0 / i;
            if (z * i != 1.0)
                System.out.print(" " + i);
        }
        System.out.println();
// An example of cast to integer rounding:
        System.out.print("cast to int rounds toward 0: ");
        d = 12345.6;
        System.out.println((int)d + " " + (int)(-d));








    }
}
