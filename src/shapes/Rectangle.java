package shapes;

public class Rectangle {

    protected int length;

    protected int width;

    //create constructors

//    public Rectangle (){ // you got this from lecture ex but since length is never 0 we don't need it
//        this.length =0;
//    }

    public Rectangle (int length, int width){ // this is a basic constructor
        this.length = length;
        this.width= width;
    }

//    public Rectangle (){ ///same thing here width is never 0 so we don't put this part
//        this.width = 0;
//    }

    public int getArea (){
        return length * width;
    }

    public int getPerimeter () {
        return length + width;
    }

    }

