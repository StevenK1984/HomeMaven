package Intro;

public class DiverseIncercari {
    public static void main(String[] args) {
        int i =1000000;
        long a = (long) i * i; // casted or else see next
        long b = i * i;
        long c = a;
        System.out.println(a);
        System.out.println("--if not casted in long it happens this--");
        System.out.println(b);
        System.out.println(c);
//        long l = i;
//        System.out.println(l - i);
//        System.out.println(20296 / (l - i));
        //-------------------//
//        try{
//        long l = i;
//        System.out.println(l);
//        System.out.println(l * l + " << aici");
//            System.out.println(20296 / (l - i));
//        } catch (Exception e) {
//            System.out.println("Error catched here");
//        }
        //-------------------//
//        int i = 50/0;
//        System.out.println(i); // arithmetic exception
        //-------------------//

//        try{
//            int a[] = new int[5];
//            a[5]=30/0;
//        } catch (Exception e){
//            System.out.println("common task completed");}
//        catch (ArithmeticException e){
//            System.out.println("task 1 is completed");}
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("task 2 completed");
//        }
//        System.out.println("rest of the code");
        //-------------------//

        }

}
