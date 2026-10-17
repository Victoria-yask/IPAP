package Practice8;

public class AirTravel  implements ITravel{
    Airplane plane;


    @Override
    public void setup(Site from) {
        plane = new Airplane("Самолетик");
        System.out.println("Покупаем билет в "+from+" на "+plane);
    }

    @Override
    public void relax(Site to) {
        System.out.println("Выгружаемся из "+plane +" в пункте "+to);
    }

    @Override
    public void move(Site from, Site to) {
        plane.move(from, to);
    }
}
