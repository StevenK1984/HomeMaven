package Intro;

public class TesteOperatii {
    public static void main(String[] args) {

//        int base = 2, exponent = 2, expo;
//        expo=exponent;
//        long power = 1;
//        while (exponent != 0)
//        {
////calculates power
//            power = power * base;
////decrements the power by 1
//            --exponent;
//        }
//        System.out.println(base +" to the power " +expo + " is: "+power);
//        System.out.println(2);

        int nrBaza=2;
        int nrExpo=3;
        int resul=1;

        for (int i=1; i<=nrExpo; i++){
            resul=resul*nrBaza;

            System.out.println("aici" + resul);
            System.out.println("--------");
        }

        System.out.println(resul);
    }


//    base=2 exponent=^

}
