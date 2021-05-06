import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

//        //1.
//        double pi = 3.14159;
//System.out.println("The value of pi is approximately " + pi);
//
//        //Scanner Class// takes in user input
//
//        //1.
//        Scanner sc = new Scanner(System.in); // initializing with declaring a variable
//        System.out.println("Enter your favorite number");
//        int faveNumber = sc.nextInt();
//
//        //2.
//        System.out.println("Enter three words");
//
//        String wordOne = sc.next();
//        String wordTwo = sc.next();
//        String wordThree = sc.next();
//
//        System.out.println(wordOne + " " + wordTwo + " "+ wordThree);
//
//        //3.
//        System.out.println("Enter a sentence");
//        String aSentence = sc.next();
//
//        //4.
//        System.out.println("Type anotha one");
//        String anotherSentence = sc.nextLine();
//        // this method doesn't allow me to type in the sentence, next only captures one word
//
//
//        //Calculate the perimeter and area of Codeup
//
//        //1.
//        System.out.println("Enter the length
//        of classroom");
//          int length =
//

// WALKTHROUGH!!!!//


            //1.
            double pi = 3.14159;
            System.out.format("The value of pi is approx. $.2f.\n", pi);

            // Section 2.
          Scanner sc = new Scanner(System.in);

          //1.
//            System.out.println("Please enter your number");
//            int number = sc.nextInt();
//            System.out.println("number = " + number);
//
            //2.
//            System.out.println("Please enter 3 words.");
//            String word1= sc.next();
//            String word2 = sc.next();
//            String word3 = sc.next();
//
//            System.out.printf("%s\n%s\n%s\n", word1, word2, word3);
//
//            //3.
//            System.out.println("Tell me something.");
//            String something = sc.nextLine();
//            System.out.println("You entered:");
//            System.out.println(something);

            //4.

            // Section 3: Area of classroom

            System.out.println("Please enter the length of the classroom");
            int length = Integer.parseInt(sc.nextLine());

            System.out.println("Please enter the width of the classroom.");
            int width = Integer.parseInt(sc.nextLine());

            int area = length * width;
            int perimeter = ( length *2 + width * 2);

            System.out.printf("The area is: %d\n", area);
            System.out.printf("The perimeter is: %d\n", perimeter);

            //BONUS//



    }
}

