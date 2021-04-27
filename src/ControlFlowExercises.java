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
//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//
//
//        }
//

//2. Fizzbuzz

        //printout 1-100
//        int i = 1;
//        do {
//            System.out.println(i);
//            i = ++i;
//        } while ( i <= 100);

        // multiples of three print fizz
//        for (int i = 1; i <= 100; i++) {
//            if( i % 15 ==0){
//                System.out.println("FizzBuzz");
//            }
//            else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//
//                System.out.println(i); // else is what happens when no conditions are met
//            }
//      }


        //3. Display a table of powers

        //prompt the user
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What number would you like to go up to?");
//        int power = scanner.nextInt();
//
//        // print the table
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("-------|---------|-----");
//
//        for ( int i = 1; i <= power; i++){
//            int squared = i * i;
//            int cubed = i * i * i;
//            System.out.printf("%d | %d | %d \n", i, squared, cubed);
//        }


        //4. Grades

        // prompt

        Scanner scanner = new Scanner(System.in);
        boolean confirmation; // have to identify the boolean value, this is what will confirm what the user inputs 'this boolean is called confirmation'
        do {
            System.out.println("Enter your grade");
            int grade = scanner.nextInt();
            if (grade >= 88) {
                System.out.println("You earned an A!");
            } else if (grade >= 80) {
                System.out.println("You earned a B!");
            } else if (grade >= 67) {
                System.out.println("You earned a C!");
            } else if (grade >= 60) {
                System.out.println("You got an F");
            }
            System.out.println("Would you like to continue? [y/n]");
            String userInput = scanner.next();
            confirmation = userInput.equalsIgnoreCase("y");
        } while (confirmation);


    }


            }







