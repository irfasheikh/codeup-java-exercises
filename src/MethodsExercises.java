import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(1, 2));
//        System.out.println(multiplication(1, 2));
//        System.out.println(division(1, 2));
//        System.out.println(modulus(1, 2));
//        getInteger(1, 10);
//    }

    // Basic Arithmetic
    //1.
//    public static int addition(int num1, int num2) {
//        return num1 + num2;
//
//    }
//
//    public static int subtraction(int num1, int num2) {
//
//        return num2 - num1;
//    }
//
//    public static int multiplication(int num1, int num2) {
//
//        return num1 * num2;
//    }
//
//    public static int division(int num1, int num2) {
//        return num2 / num1;
//    }
//
//    public static int modulus(int num1, int num2) {
//
//        return num2 % num1; //give the remainder
//    }
//

//2. Range //

//public static void getInteger(int min, int max){
//    Scanner scanner = new Scanner(System.in);
//
//        boolean wrongInput; // this variable is a boolean
//        do {
//            System.out.printf("Enter a number between %d and %d",min, max);
//            int userInput = Integer.parseInt(scanner.next());
//
//            if( userInput >= min && userInput <= max) {
//                System.out.println("We are in the range");
//                wrongInput = false; // falls within the range, so it IS a correct input and will exit the loop
//            } else {
//            System.out.println("Enter a valid number");
//                wrongInput = true;
//            }
//
//                } while (wrongInput); //if they put the wrong thing, they're trapped in the loop, to get the loop to stop, we have to make it false
//            }
//
//
//    };

//curly braces are the instructions for whats supposed to happen inside
//put the system inside of {}

//3. Factorial of a Number

//    public static long getFactorial(int num) {
//        Scanner scanner = new Scanner(System.in);
//        boolean itsWrong;
//        boolean confirmation;
//        do {
//            System.out.println("Enter a number between 1-10");
//            int userNumber = Integer.parseInt(scanner.next());
//            System.out.println(userNumber);
//
//            System.out.println("Would you like to continue? [y/n]");
//            String userInput = scanner.next();
//
//            if (confirmation = userInput.equalsIgnoreCase("y")) ;
//            {
//                long fact = 1;
//
//                for (int i = 2; i <= num; i++) {
//                    fact = fact * i;
//                }
//                return fact;
//
//            }
//            while ((confirmation)) ;


//        }


        //4. dice rolling

        public static void getRolling(int roll){
            // it's void bc you are just spitting out what the user is inputing,
            // public void you are using the method but you are not expecting an outcome from the function itself.
            // void you are just getting the answer not making something to get the answer

            int input;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of sides on your dice!"); //invoking sout and passing in string
            input = scanner.nextInt(); //assignment to the variable input, we are going to invoke the nextInt method on the scanner and its going to grab the next integer typed into the terminal
            System.out.println("Now roll the dice!");



            System.out.println(roll);

        }

    }
    }