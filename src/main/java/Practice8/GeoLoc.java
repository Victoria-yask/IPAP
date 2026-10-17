package Practice8;

//поля ширина и долгота
public class GeoLoc extends Site {
    double latitude;
    double longitude;

    public GeoLoc(String alias, double latitude, double longitude) {
        super(alias);//псевдоним точки
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "GeoLoc{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", alias='" + alias + '\'' +
                '}';
    }

    //расстояние
    @Override
    public double distanceTo(Site to) {
        if (to instanceof GeoLoc){ //если куда собираемся явл. геоточкой
            System.out.println("Расстояние между парами координат буду считать, как будто Земля плоская!");
            GeoLoc b = (GeoLoc) to;// превращает ссылку to (тип Site) в ссылку того же объекта, но уже с типом GeoLoc. Результат — в переменной b.
            return Math.sqrt((b.latitude - this.latitude)*(b.latitude - this.latitude) + (b.longitude - this.longitude)*(b.longitude - this.longitude));
        }
        else {
            System.out.println("Пока не научились считать расстояние");
            return -1;//-1 пример
        }
    }
}
