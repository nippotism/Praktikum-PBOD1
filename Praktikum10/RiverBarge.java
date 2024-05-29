public class RiverBarge extends Vehicle{

    private double maxLoad;

    public RiverBarge(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad*0.0;
    }

    public double calcTripDistance() {
        return maxLoad*0.0;
    }
    
}
