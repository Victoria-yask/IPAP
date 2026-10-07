package Lesson11;

import java.util.Arrays;

public class Main {

    static void main() {
       // exampleBoat1();
      //  exampleBoat2();
       // exampleBoat3();
        exampleBoat4();
    }

    private static void exampleBoat4() {
        PassengerMotorboat pb = new PassengerMotorboat(100, 1, 2);
        pb.takePassenger("Нина");
        System.out.println(Arrays.toString(pb.passengers));
        pb.takePassenger("Вася");
        System.out.println(Arrays.toString(pb.passengers));
        pb.takePassenger("Кузнец");
        System.out.println(Arrays.toString(pb.passengers));

        String person = pb.unloadLastPassenger();
        System.out.println("на берег сошел " + person);
        System.out.println("в лодке сейчас " + Arrays.toString(pb.passengers));
        person = pb.unloadLastPassenger();
        System.out.println("на берег сошел " + person);
        System.out.println("в лодке сейчас " + Arrays.toString(pb.passengers));

    }

    private static void exampleBoat3() {
        Motorboat mb = new Motorboat(100, 1);
        mb.startEngine();
    }

    private static void exampleBoat2() {
        SailBoat sb = new SailBoat(130, 1);
        sb.raiseSail();
        sb.downSail();
        sb.addcargo(110);
        System.out.println(sb.cargo);
    }

    private static void exampleBoat1() {
        Boat boat1 = new Boat(135);
        Boat boat2 = new Boat(50);
        System.out.println(boat1.getCargo() + " "+ boat2.getCargo());
        boat1.addcargo(45);
        boat2.addcargo(45);
        System.out.println(boat1.getCargo() + " "+ boat2.getCargo());
        boat1.addcargo(70);
        boat2.addcargo(70);
        System.out.println(boat1.getCargo() + " "+ boat2.getCargo());
        boat1.removecargo(25);
        boat2.removecargo(25);
        System.out.println(boat1.getCargo() + " "+ boat2.getCargo());

    }
}
