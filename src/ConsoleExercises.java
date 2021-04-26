import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

        //1.
        double pi = 3.14159;
System.out.println("The value of pi is approximately " + pi);

        //Scanner Class// takes in user input

        //1.
        Scanner sc = new Scanner(System.in); // initializing with declaring a variable
        System.out.println("Enter your favorite number");
        int faveNumber = sc.nextInt();

        //2.
        System.out.println("Enter three words");

        String wordOne = sc.next();
        String wordTwo = sc.next();
        String wordThree = sc.next();

        System.out.println(wordOne + " " + wordTwo + " "+ wordThree);

        //3.
        System.out.println("Enter a sentence");
        String aSentence = sc.next();

        //4.
        System.out.println("Type anotha one");
        String anotherSentence = sc.nextLine();
        // this method doesn't allow me to type in the sentence


        //Calculate the perimeter and area of Codeup

        //1.
        System.out.println("Enter the length and width of classroom");





    }
}

