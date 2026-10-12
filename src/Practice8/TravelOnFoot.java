package Practice8;

public class TravelOnFoot implements ITravel{
    @Override
    public void setup(Site from) {
        System.out.println("Пакуем рюкзак");
    }

    @Override
    public void relax(Site to) {
        System.out.println("Распаковываем рюкзак");
    }

    @Override
    public void move(Site from, Site to) {
        new Hiker().move(from, to);
    }
}
