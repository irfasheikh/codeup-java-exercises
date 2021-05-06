package shapes;
//
//public class Square extends Quadrilateral {
//    private int side;
//
//    public Square(double side) {
//        super(side, side); /// super points back to your original one, goes back to rectangles, make sure length and width equal to side
        // rectangle is the parent class, when square constructor created, super is referring to what you're extending here rectangle, super references the constructor for rectangle
//        this.side = side; // this tells is the side is also = to the side you passed in, you  have to assign it to line 4 side
//    }

//    public void setLength(double length){}
//        public double getPerimeter(){
//            return 4 * side;
//        }
//
//        public double getArea(){
//            System.out.println("override");
//            return side * side;
//        }



    public class Square extends Quadrilateral {

        public Square(double side) {
            super(side, side); /// super points back to your original one, goes back to rectangles, make sure length and width equal to side
        }

//            public void setLength ( double length){
//                this.length = length;
//
//            }
//
//            public void setWidth (double width){
//                this.width = width;
//
//            }



        @Override
        public void setLength(double length) {

        }

        @Override
        public void setWidth(double width) {

        }
    }

