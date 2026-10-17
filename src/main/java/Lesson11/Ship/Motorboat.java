package Lesson11.Ship;

public class Motorboat extends Boat{

    double engineV;
    boolean engineOn;

    public Motorboat(double maxCargo, double engineV) {
        super(maxCargo);
        this.engineV = engineV;
    }

    public void startEngine(){
        engineOn=true;
    }

    public void stopEngine(){
        engineOn=false;
    }

    public void sound(){
        if (engineOn)
            System.out.println("тарахтит мотор");
    }

    @Override
    public String toString() {
        return "Motorboat{" +
                "engineV=" + engineV +
                ", engineOn=" + engineOn +
                ", cargo=" + cargo +
                '}';
    }
}
