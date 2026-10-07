package Lesson11;

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



}
