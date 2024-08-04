package abstract7;

public class Car extends Vehicle {

    public Car(double sp) {
        super(sp);
    }

    @Override
    public void startEngine() {
        this.speed = 231;
    }

    @Override
    public void stopEngine() {

    }
}
