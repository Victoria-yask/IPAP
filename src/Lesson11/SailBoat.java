package Lesson11;

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

    static void main() {

    }
}
