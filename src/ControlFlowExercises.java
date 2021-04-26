import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

        //1. Loop basics

        //a. While

//        int i = 5;
//         while (i <= 15) {
//                System.out.println( i);
//                i++;
//            }

        //b. Do While

//        int i = 0;
//        do {
//
//System.out.println(i); // first print out i (0) and then add 2
//            i += 2;
//
//        } while (i <= 100) ;//whatever in the body goes until it reaches 100


        // start at 2

//        int i = 0;
//        do {
//            i += 2;
//            System.out.println(i); // first print out i (0) and then add 2
//
//
//        } while (i < 100) ;//whatever in the body goes until it reaches 100


        // count backwards

//        int i = 100;
//        do{
//            System.out.println(i);
//            i-= 5;
//
//        } while (i >= -10);

        //number squared

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);


//refactor
        for (long i = 2; i < 1000000; i *= i) {
            System.out.println(i);


        }


//2. Fizzbuzz

        //printout 1-100
//        int i = 1;
//        do {
//            System.out.println(i);
//            i = ++i;
//        } while ( i <= 100);

        // multiples of three print fizz
        int i = 1;
        do {
            System.out.println(i);
            i = i % 3 ==0;
        } while ( i <= 100);




        }




        }




