package Intro;

import java.util.Scanner;

public class Citire {
    public static void main(String[] args) {

//        Scanner cititor = new Scanner(System.in);
//        System.out.println("Introduceti textul dorit: ");
//        String textIntrodus = cititor.nextLine(); // are rol de a citi un string
//        System.out.println("Text demo introdus " + textIntrodus);
//        System.out.println("Introduceti numarul dorit: ");
//        int numarIntrodus = cititor.nextInt(); // are rol de a citi un int
//        System.out.println("Nr demo introdus " + numarIntrodus);

        // ex 1
//        Scanner profesie = new Scanner(System.in);
//        System.out.printf("Ce profesie iti doresti?: ");
//        String profesiaMea = profesie.nextLine();
//        System.out.println(" Tine-o tot asa si vei deveni: " +profesiaMea);
        // ex 2
//        Scanner aniiMei = new Scanner(System.in);
//        System.out.printf("Cati ani ai? : ");
//        int ani = aniiMei.nextInt();
//        System.out.println("Inteleg ca ai " + ani + " ani."); // = Inteleg ca ai 37 ani. << Prin cocatenare
//        System.out.printf("Inteleg ca ai %d ani.", ani); // = Inteleg ca ai 37 ani. << prin system.out.prinf

        // ex 3
        Scanner sexulMeu = new Scanner(System.in);
        System.out.printf("Ce sex ai ?: ");

        char sexIntrodus = sexulMeu.next().toUpperCase().charAt(0);
//        System.out.printf("Sexul tau este: %c", sexIntrodus);

        if (sexIntrodus =='M') {
            System.out.println("Sexul tau este: Masculin ( " + sexIntrodus + " )"); // = Sexul tau este: Masculin ( M )
        } else if (sexIntrodus=='F'){
            System.out.println("Sexul tau este: Feminin conform ( " + sexIntrodus + " )");
        } else {
            System.out.println("Esti mutant!");
        }








    }
}
