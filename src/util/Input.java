//package util;
//
//import java.util.Scanner;
//
//public class Input {
//
//    private Scanner scanner; /// setup scanner
//
//    public Input() { // every time an input is created its going to be a new scanner and
//        this.scanner = new Scanner(System.in); // every time Input made, it will be assigned to a new scanner to use
//    }
//        public String getString() {
//            return this.scanner.nextLine();
//        }
//
//        public boolean yesNo() { //method called yes no
//           String input = scanner.nextLine(); // user has to put string as an input
//           return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")); // return if they say yes or y
//        }
//
//        public int getInt(int min, int max){
//            System.out.println("Put a number between " + min +"and"+ max);
//            int num = scanner.nextInt();
//
//            if (num >= min && num <= max){
//                return num;
//            } else {
//                System.out.println("The number entered is invalid");
//                return getInt(min, max);
//            }
//        }
//
//        public int getInt() {
//        System.out.println("Enter an integer");
//        int num = scanner.nextInt();
//        return num;
//        }
//
//    public double getDouble(){
//        System.out.println("Enter a decimal number ");
//        double doubleNum = scanner.nextInt();
//        return doubleNum;
//    }
//
//        }

//Exceptions and Error Exercise

package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner; /// setup scanner




    public int getInt() {
        System.out.println("Type in a number!");
        try { int input = Integer.valueOf(getString()); // taking getString and converting into an integer

        // \\try means execute a piece of code, looking to see if theres an error, try this out and see if it works, i think it's going to give an error
        // we don't need this //System.out.println(Integer.valueOf(input));
            return input; // if there's no errors, return the input
            // if theres an error it skips over return and goes to catch
    } catch (NumberFormatException e){  // check if it's this error, is the input a number, this is saying does the input match the data type, does data type match the stored variable
           // if it does give this numberformat error what do i want it to do?
            System.out.println("Hey you typed in the wrong number! I'm setting it to 0!");
            return 0;
        }
    }


    public String getString() {
            return this.scanner.nextLine(); // within the getint use the get string, get string is scanning what you type
        }


//    public double getDouble(){
//        System.out.println("Enter a decimal number ");
//        String input = scanner.next();
//        System.out.println(Double.valueOf(input);
//        return Double.valueOf(input);
//    } catch (NumberFormatException e) {
//        e.printStackTrace(System.out);
//        System.out.println("e.message() =" + e.getMessage());
//        System.out.println("Das a string");
////        return 0;
//    }
//
}

