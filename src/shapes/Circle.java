package shapes;

public class Circle {
    public static int sides = 0; //field

//    public static int getSides(){
//
//        return sides + radius;
//    } // this doesnt work because radius isn't static, we can't access an instance data from inside of something that doesnt need an instance to run

// this is a static method to get sides


    private double radius; //  this is the private radius property, use double bc you need to include decimal places, if you don't know how big number will get, use double it has biggest capacity
// this is an instance field


    public Circle(double radius) {              //constructor, this is going to make a circle in the circleApp, inside of the () is the parameter, a constructor is a special method, it doesnt have a return type-- a constructor returns (when we run new) a new instance of the class automatically, we dont have to use the return keyword
        this.radius = radius;
    }

    public double getArea() {                 //instance method -- methods have a return if they're not void
        return Math.PI * (radius * radius);
    }

    public double getCircumference() {      // instance method
        return Math.PI * (radius * 2);


    }
}


