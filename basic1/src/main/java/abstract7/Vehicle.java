package abstract7;

public abstract class Vehicle {
    protected double speed;

    public Vehicle(double speed){
        this.speed = speed;
    }
    public abstract void startEngine();

    public abstract void stopEngine();
}
