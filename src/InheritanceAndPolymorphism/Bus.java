package InheritanceAndPolymorphism;

public class Bus extends Vehicle {
    private boolean headLightsOn;

    public Bus(int maxSpeed) {
        super(maxSpeed); // super class level is the vehicle class
        this.headLightsOn = false;
    }

    public void start() {
        System.out.println("...cranking bus engine");
    }

    public void honkHorn(){
        System.out.println("Honk! Honk!!!!");
    }

    public boolean isHeadLightsOn() {
        return headLightsOn;
    }

    public void setHeadLightsOn(boolean headLightsOn){
        this.headLightsOn = headLightsOn;


    }
}
