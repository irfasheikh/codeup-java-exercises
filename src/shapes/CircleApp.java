package shapes;
import util.Input;
import java.util.Scanner;


public class CircleApp {

    public static void main(String[] args){ // this is what we use to to put userinput, this is the main method and needed for java to run your code
        double input; // assign the scanner to this input

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        input = scanner.nextDouble(); // this is saying to take the input and display on the next line, this is verifying that the use puts in a double, when yo use sc.next its spitting out what the user puts in


        Circle newCircle = new Circle(input); // this is creating a new instance of circle
        //when we create a new instance of a class what gets run?
        //the constructor runs, we are calling the constructor
        // this looks like line 9 in circle
        // using new in constructor gets back new instance of the class
        //everything that does not have a static keyword is available on that new instance
        System.out.println("The circumference is " + newCircle.getCircumference());
        System.out.println("The area is " + newCircle.getArea());

        System.out.println(Circle.sides); //class name. whatever is how we access statics ON the class use .

        //Circle.getArea(); //() goes after methods
// the class name is static so it can't run getArea bc getArea only works on instances, its an instance method
        // if the word static is not there, it is part of the instance
        //in order to get to a static field or static method we have to say the class name .
        // if its instance, we get to it using the instances, using the new keyword and assign that new instance to the variable
        // a field is a variable on a class
        // a method is a function on class, method is attached to a class
        //everything that's like a function in java is a method
        // statics: there's only one copy of the class, so the sides = 0 only exists once in there in the blueprint
        // anew copy of every instance variable exists for as many times as you create a new instance of the object
        // like in rectangle exercise the box 1 and 2 are instances of the class


    }



}
