package shapes;



//    protected int length;
//
//    protected int width;
//
//    //create constructors
//
////    public Rectangle (){ // you got this from lecture ex but since length is never 0 we don't need it
////        this.length =0;
////    }
//
//    public Rectangle (int length, int width){ // this is a basic constructor
//        this.length = length;
//        this.width= width;
//    }
//
////    public Rectangle (){ ///same thing here width is never 0 so we don't put this part
////        this.width = 0;
////    }
//
//    public int getArea (){
//        return length * width;
//    }
//
//    public int getPerimeter () {
//        return 2* length + 2* width;
//    }
//
//    }
//
public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width); // the super targets the constructor inside of quadrilateral
    }


    public void setLength (double length) {
        this.length = length;
    }

     public void setWidth(double width) {
            this.width = width;
        }

    @Override //simce rectangle comes from quad, i have my own method for finding perimeter of rectangle diff from quadrilateral
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
