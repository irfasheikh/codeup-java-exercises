package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner; /// setup scanner

    public Input() { // every time an input is created its going to be a new scanner and
        this.scanner = new Scanner(System.in); // every time Input made, it will be assigned to a new scanner to use
    }
        public String getString() {
            return this.scanner.nextLine();
        }

        public boolean yesNo() { //method called yes no
           String input = scanner.nextLine(); // user has to put string as an input
           return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")); // return if they say yes or y
        }

        public int getInt(int min, int max){
            System.out.println("Put a number between " + min +"and"+ max);
            int num = scanner.nextInt();

            if (num >= min && num <= max){
                return num;
            } else {
                System.out.println("The number entered is invalid");
                return getInt(min, max);
            }
        }

        public int getInt() {
        System.out.println("Enter an integer");
        int num = scanner.nextInt();
        return num;
        }

    public double getDouble(){
        System.out.println("Enter a decimal number ");
        double doubleNum = scanner.nextInt();
        return doubleNum;
    }

        }



