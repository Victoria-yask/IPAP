package Lesson11.Ship;

import java.util.Arrays;

public class PassengerMotorboat extends Motorboat {

    int maxAmount;
    int amount;
    String[] passengers;

    public PassengerMotorboat(double maxCargo, double engineV, int maxAmount) {
        super(maxCargo, engineV);
        this.maxAmount = maxAmount;
        passengers = new String[maxAmount];
    }

    public void takePassenger(String name){
        if (amount < maxAmount){
            passengers[amount] = name;
            amount++;
        }
        else
            System.out.println("места закончились");
    }

    public String unloadLastPassenger(){
        if(amount>0){
            String name = passengers[amount-1];
            passengers[amount-1] = null;
            amount--;
            return name;
        }
        return "никого не было";
    }

    public String getPassengerStr(){
        return Arrays.toString(passengers);
    }

    @Override
    public String toString() {
        return "PassengerMotorboat{" +
                "maxAmount=" + maxAmount +
                ", amount=" + amount +
                ", passengers=" + Arrays.toString(passengers) +
                '}';
    }
}
