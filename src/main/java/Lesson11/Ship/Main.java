package Lesson11.Ship;

public class Main {

    static void main() {
       // exampleBoat1();
      //  exampleBoat2();
       // exampleBoat3();
      // exampleBoat4();
        exampleBoat5();

    }

    private static void exampleBoat5() {
        PassengerMotorboat pb = new PassengerMotorboat(150, 1.5, 4);
        System.out.println(pb.toString());
        System.out.println(pb.getClass().getCanonicalName());

        Boat b = new Boat(111);
        System.out.println(b + "" + pb);
    }

    private static void exampleBoat4() {
        PassengerMotorboat pb = new PassengerMotorboat(100, 1, 2);
        pb.takePassenger("Нина");
        System.out.println(pb.getPassengerStr());
        pb.takePassenger("Вася");
        System.out.println(pb.getPassengerStr());
        pb.takePassenger("Кузнец");
        System.out.println(pb.getPassengerStr());

        String person = pb.unloadLastPassenger();
        System.out.println("на берег сошел " + person);
        System.out.println("в лодке сейчас " + pb.getPassengerStr());
        person = pb.unloadLastPassenger();
        System.out.println("на берег сошел " + person);
        System.out.println("в лодке сейчас " + pb.getPassengerStr());

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
