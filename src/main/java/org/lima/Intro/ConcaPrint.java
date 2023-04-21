package Intro;

public class ConcaPrint {
    public static void main(String[] args) {
//        int numar=10;
//        String text =" Test";
//        double numarDouble = 11.1;
//        float nrFloat = 11.3f;
//        boolean adevar = true;
//        char c ='b';
//        char a ='a';


//        System.out.println("variabila mea string are valoare " + text);
//        System.out.println("numarul meu este " + numar);
//        System.out.println(numarDouble + " este numarul meu double");
//        System.out.println(nrFloat + " este numarul meu float");
//        System.out.println("am declarat un caracter " + c);
//
//        //folosim ".printf" atunci cand nu dorim sa includem mai multe concatenari
//        System.out.printf("am declarat o valoare string cu valoarea %s\n", text);
//        //System.out.println();
//        System.out.printf("am declarat o variabila de tip int cu valoarea %d", numar);
//        System.out.println();
//        System.out.printf("am declarat o variabila de tip int cu valoarea %f\n", numarDouble);
//        System.out.printf("un string, un int, un float: %s, %d, %f, %b, %c \n", text, numar, nrFloat, adevar, c);
//        System.out.printf("Urmatoarele vor fi:\n string: %s\n int: %d\n float: %f\n boolean: %b\n caracter: %c \n", text, numar, nrFloat, adevar, c);
//        System.out.printf("");

//        System.out.print("print(1)");
//        System.out.print(" + print(2)");
//        System.out.println(" + printLn(5)");
//        System.out.print(" + print(3)");
//        System.out.printf(" + printF(4)");
//        System.out.println(" printLn(6)");
//        System.out.printf("dsa");
//        System.out.printf(" + dsassa");

//              char a = 'z';
//              int b = a;
//        System.out.println(a);
//        System.out.println(a + b + a); // b capata valoare din cauza ASCII to int

        String name = "Olandezul";
        for(char c : name.toCharArray()) {
            // access each character
            System.out.printf(c + ", ,");
        }


        }
}
