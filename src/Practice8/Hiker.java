package Practice8;

public class Hiker implements IMove{
    @Override
    public void move(Site from, Site to) {
        System.out.println("Топаем из "+from + " в "+to);
    }
}
