public class Bird extends Animal implements IFlyer{

    public void eat() {
        System.out.println("Burung Makan");
    }

    public void takeOff() {
        System.out.println("Burung Berangkat");
    }

    public void land() {
        System.out.println("Burung Mendarat");
    }

    public void fly() {
        System.out.println("Burung Terbang");
    }
    
}
