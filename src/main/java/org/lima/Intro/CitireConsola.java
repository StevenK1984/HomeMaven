package Intro;

public class CitireConsola {
    public static void main(String[] args) {

        //pasarea variabilei dintr-un bloc de tip "While true"

        int m = 10;
        while (true){

            int n = 11;
            n -= 1;
            m=n;
            System.out.println(m);
            break;
        }
        System.out.println(m + " Plus aici");



        //pasarea variabilei dintr-un bloc de tip for each

        char s = 'a';
        for (int i=0; i <10; i++) {
            System.out.println(i);
            System.out.println(i=s);

        }
        System.out.println("----------");
        System.out.println(s);


    }
}
