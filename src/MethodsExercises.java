import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(1, 2));
        System.out.println(subtraction(1, 2));
        System.out.println(multiplication(1, 2));
        System.out.println(division(1, 2));
        System.out.println(modulus(1, 2));
        getInteger(1,10);
    }

    // Basic Arithmetic
    //1.
    public static int addition(int num1, int num2) {
        return num1 + num2;

    }

    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num2 / num1;
    }

    public static int modulus(int num1, int num2) {
        return num2 % num1; //give the remainder
    }


//2. Range //

public static void getInteger(int min, int max){
    Scanner scanner = new Scanner(System.in);

        boolean wrongInput = false;
        do {
            System.out.printf("Enter a number between %d and %d",min, max);
            int userInput = Integer.parseInt(scanner.next());

            if( userInput >= min && userInput <= max) {
                System.out.println("We are in the range");

            } else if (wrongInput== true) {
            System.out.println("Enter a valid number");}


                } while (wrongInput); //if they put the wrong thing, they're trapped in the loop, to get the loop to stop, we have to make it false
            }


    }

//curly braces are the instructions for whats supposed to happen inside
//put the system inside of {}