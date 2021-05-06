import java.util.Random;
import java.util.Scanner;


public class HighLow {

    public static void main (String[] args) { // when is this void vs not?
        // java needs this entry point to run the code, and you can create as many classes you want but you need this to have the entry point, it scans your code and knows what to use to run

        //static vs non static
        // static fields and methods are ON the class
        //Instance (aka non static) fields and methods are on INSTANCES of the class
        // how do we create an instance of a class? what is an instance?
        //a class is a blueprint, then we say we need to create something based on this





        Random random = new Random(); // creating a new instance of the random class
        // this statement is saying use the blueprint to create a new random and putting it into the variable random
        // there are 2 statements: 1 is a declaration we declare a variable random of type Random class
        // 2nd part: after = we are asking for a new instance of Random to be created and assigned to the random variable *pay attention to case*

        // how do we create a new instance of a class?





        //game picks random number 1-100
            int random1 = random.nextInt(100);
        System.out.println("Guess the number!");






    }



}
