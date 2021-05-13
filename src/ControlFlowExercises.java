import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) { // return nothing, so its void

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

//        Scanner scanner = new Scanner(System.in);
//        boolean confirmation; // have to identify the boolean value, this is what will confirm what the user inputs 'this boolean is called confirmation'
//        do {
//            System.out.println("Enter your grade");
//            int grade = scanner.nextInt();
//            if (grade >= 88) {
//                System.out.println("You earned an A!");
//            } else if (grade >= 80) {
//                System.out.println("You earned a B!");
//            } else if (grade >= 67) {
//                System.out.println("You earned a C!");
//            } else if (grade >= 60) {
//                System.out.println("You got an F");
//            }
//            System.out.println("Would you like to continue? [y/n]");
//            String userInput = scanner.next();
//            confirmation = userInput.equalsIgnoreCase("y");
//        } while (confirmation);




        // ** WALKTHROUGH***//

        // 1. while loop

//        int i = 5;
//        while ( i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }


        // b. do while

        // count to 100
//        int counter = 0; //this is a variable we just called it counter
//
//        do {
//         counter += 2; //do everything in here , add by 2
//            System.out.println("counter = " + counter);
//        } while (counter < 100); //while it meets this condition

        //count backwards by 5

//        int counter = 100; //this is a variable we just called it counter
//
//        do {
//            counter -= 5; //do everything in here , subtract by 5
//            System.out.println("counter = " + counter);
//        } while (counter >= -10); // do it until it is less than -10


        // do-while start at 20 end million

//        long sum = 2; // state the var, here we named it var, need a starting value in order to multiply , switch from int to long bc big number, it'll get overloaded
//
//        do {
//            System.out.println(sum);
//            sum *= sum;
//        } while (sum < 1_000_000); // can use underscore to separate out


// for loop

//        for (int counter = 100; counter >= -10; counter -=5){
//            System.out.println("counter = " + counter);
//        }

//        for(long sum = 2L; sum < 1_000_000; sum *= sum) {
//    System.out.println("sum = " + sum);


        // fizzbuzz

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) { // most specific, divisible by both, we could also just put 15
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println("i = " + i);

            }
        }


        // table of powers, use a do while bc you go through it and you ask them if they want to continue, it iterates once, you also need a way to get out
        Scanner scanner = new Scanner(System.in); // taking in input
        boolean userContinue = true; // this is a way for the loop to stop, user has to say no
        do {
            System.out.println("What number would you like to go up to?") ; // prompt the user since we need their input, need a scanner, taking in inputs

            int userInt = scanner.nextInt();
            System.out.println();
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("number  | squared   | cubed");
            System.out.println("--------|-----------|-------");

            for(int i =1; i<= userInt; i++){
                // print out the table;
                System.out.printf("%-7d | %-9d | %d\n", i , i * i, i * i * i); // note not print ln its print f, this is the formatting
            }
            System.out.println("Do you want to continue?");
            String userResponse = scanner.next();

            if(!userResponse.equalsIgnoreCase("y")){
                userContinue = false;
            }
         // userContinue = false;    // this is in infinite so just put this false so it doesnt go into infinite loop and comment out or take it out when you're done
        } while (userContinue);
//

        // grades do while loop

//        Scanner scanner = new Scanner(System.in);
//
//        boolean anotherGrade = true;
//        do {
//            System.out.println("Enter numerical grade 0-100");
//            int numGrade = scanner.nextInt();
//
//            if (numGrade >= 88) {
//                System.out.println("A");
//            } else if (numGrade >= 87) {
//                System.out.println("B");
//            } else if (numGrade >= 67) {
//                System.out.println("C");
//            } else if (numGrade >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//            System.out.println("Do you want to input another grade?");
//
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                anotherGrade = false;
//            }
//
//        } while (anotherGrade);
    }
}








