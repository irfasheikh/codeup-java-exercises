package InheritanceAndPolymorphism;

public class Jet extends Vehicle {
    private int altitude;

    //create a constructor to control the altitude

    public Jet( int maxSpeed) {
        super (maxSpeed);
        this.altitude = 0;

    }
    public void start(){
        System.out.println("...igniting jets!");
    }
}
