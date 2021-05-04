package InheritanceAndPolymorphism;

public class Vehicle {
    private int numberOfOccupants;

    private int maxSpeed;

    //constructors create

    public Vehicle(){  //constructor this one creates a new vehicle and auto assigns 0
        this.maxSpeed =0;

    }

    public Vehicle(int maxSpeed) { // constructor if you want to put a speed use this
        this.maxSpeed = maxSpeed;
    }

    public void start(){ // method
        System.out.println("Starting...");
    }

    public int getNumberOfOccupants(){ //method
        return this.numberOfOccupants;
    }

    public void setNumberOfOccupants(int numberOfOccupants){ //method
        this.numberOfOccupants = numberOfOccupants;
    }

    public int getMaxSpeed(){
return maxSpeed;
    }
}
