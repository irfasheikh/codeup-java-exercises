import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(1, 2));
        System.out.println(subtraction(1, 2));
        System.out.println(multiplication(1, 2));
        System.out.println(division(1, 2));
        System.out.println(modulus(1, 2));
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


//2. Range //kenneth said dont use recursion
public static int getInteger(int min, int max){
    Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a number between 1 and 10: ");
            int userInput = getInteger(1, 10);

            if( userInput >= 1) {
                System.out.print("This is in the range");
            }
            else if (userInput <= 10) {
                System.out.print("We are in the range");

            } else if()


                } while (true);
            }


    }






}
