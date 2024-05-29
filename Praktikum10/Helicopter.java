public class Helicopter extends Airplane {

    private double maxLoad;

    public Helicopter(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad*0.0;
    }

    public double calcTripDistance() {
        return maxLoad*0.0;
    }

    public void takeOff() {
        System.out.println("Helicopter taking off");
    }

    public void land() {
        System.out.println("Helicopter landing");
    }

    public void fly() {
        System.out.println("Helicopter flying");
    }

    

    
}
