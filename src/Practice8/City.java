package Practice8;

public class City extends Site{
    String name;

    public City(String name) {
        super(name);//псевдоним - имя
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }

    //расстояние
    @Override
    public double distanceTo(Site to) {
        if(to instanceof City){//если to относится к городам
//         City c = (City) to;
            System.out.println("Уже составляется справочник расстояний между городами");
            System.out.println("В котором будут "+this +" и "+to);
        }
        else {
            System.out.println("Пока не научились считать расстояния от города до чего-то еще");
        }
        return -1;
    }
}

