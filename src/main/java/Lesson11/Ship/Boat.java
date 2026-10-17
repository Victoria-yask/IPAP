package Lesson11.Ship;

public class Boat {

    double maxCargo;
    double cargo;

    public Boat(double maxCargo) {
        this.maxCargo = maxCargo;
    }

    public void addcargo(double x) {
        if(cargo+x <=maxCargo)
        cargo+=x;
    }

    public void removecargo(double x) {
        if(cargo-x >=0)
            cargo-=x;
    }

    public double getCargo() {
        return cargo;
    }

    @Override
    public String toString(){
        return "<Лодка макс груз " + this.maxCargo + "загружено" + cargo +"/>";
    }
}
