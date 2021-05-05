package shapes;

public class Square extends Rectangle {
    private int side;

    public Square(int side) {
        super(side, side); /// super points back to your original one, goes back to rectangles, make sure length and width equal to side
        // rectangle is the parent class, when square constructor created, super is referring to what you're extending here rectangle, super references the constructor for rectangle
        this.side = side; // this tells is the side is also = to the side you passed in, you  have to assign it to line 4 side
    }
        public int getPerimeter(){
            return 4 * side;
        }

        public int getArea(){
            System.out.println("override");
            return side * side;
        }


    }

