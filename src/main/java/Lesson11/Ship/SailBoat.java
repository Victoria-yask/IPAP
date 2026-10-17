package Lesson11.Ship;

public class SailBoat extends Boat{

    int nMasts;
    boolean sailsOn;

    public SailBoat(double maxCargo, int nMasts) {
        super(maxCargo);
        if(nMasts>0)
            this.nMasts = nMasts;
    }

    public void raiseSail(){
        sailsOn=true;
    }

    public void downSail(){
        sailsOn=false;
    }

    @Override
    public String toString() {
        return "SailBoat{" +
                "nMasts=" + nMasts +
                ", sailsOn=" + sailsOn +
                '}';
    }
}
