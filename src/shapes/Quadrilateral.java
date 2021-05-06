package shapes;

 abstract class Quadrilateral extends Shape implements Measurable { // create abstract class called quadrilaterals bc there are shapes that will be quad, we implement measruable bc we need them dfined in this class
     // an interface is a promise saying i will  have these methods inside of this class

     protected double length; // shapes will have l and w

     protected double width;

     public Quadrilateral(double length, double width) { // constructor, will set the variable for both
         this.length = length;
         this.width = width;
     }

     public double getLength() {
         return length;
     }

     public double getWidth() {
         return width;
     }

     public abstract void setLength(double length); // void bc quadrilateral is not returning anything


     public abstract void setWidth(double width);


     public double getPerimeter() {
         return (this.length * 2) + (this.width * 2);
     }

     public double getArea() {
         return this.length * this.width;

     }
 }