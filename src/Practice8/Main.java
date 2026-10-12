package Practice8;
import java.util.*;
import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      // exemple0();
      // exemple1();
    // exemple2();
  exemple3();
    }

    private static void exemple3() {
        List<Site> sites = new LinkedList<>();
        sites.add(new GeoLoc("X", 40, 118));
        sites.add(new City("Рим"));
        sites.add(new City("Париж"));

        ITravel t = new AirTravel();
        bigTravel(sites, t);
        bigTravel(sites, new TravelOnFoot());

        bigCircleMove(sites, (from, to) -> {
            System.out.println("Телепорт " + from + " >>--->> " + to);
        });
        bigCircleMove(sites, (from, to) -> {
            System.out.println("Вы находитесь в " + from);
            System.out.println("Абра-кадабра");
            System.out.println("Вы находитесь в " + to);
        });
    }

    private static void bigTravel(List<Site> sites, ITravel t) {
        for (int i = 0; i < sites.size() - 1; i++) {
            t.travel(sites.get(i), sites.get(i + 1));
        }
        System.out.println("   ---------------------------    ");
    }

    private static void bigCircleMove(List<Site> sites, IMove m) {
        for (int i = 0; i < sites.size() - 1; i++) {
            m.move(sites.get(i), sites.get(i + 1));
        }
        m.move(sites.getLast(), sites.getFirst());
        System.out.println("   ===========================    ");
    }

    private static void exemple2() {
        Site piter = new City("Питер");
        Site moscow = new City("Москва");
        ITravel t1 = new AirTravel();
        t1.travel(moscow, piter);

        ITravel t2 = new TravelOnFoot();
        t2.travel(piter, new Address("Ленина", 3, 15));

        ITravel t3 = new ITravel() {
            @Override
            public void setup(Site from) {
                System.out.println("Магическая формула");
            }

            @Override
            public void relax(Site to) {
                System.out.println("Развеять остаточную магию");
            }

            @Override
            public void move(Site from, Site to) {
                System.out.println("Портальное перемещение из " + from + " в " + to);
            }
        };
        t3.travel(piter, new City("Авалон"));
    }

    private static void exemple1() {
        Site a = new GeoLoc("А", 60, 30);
        Site b = new GeoLoc("Б", 62, 29);
        //Объекты конкретных именованных классов, реализующие интерфейс IMove:
        Airplane plane = new Airplane("Ту-104");
        plane.move(a, b);
        Hiker hiker = new Hiker();
        hiker.move(b, a);

        //Объект анонимного класса чтобы н создавать отдельный класс
        IMove something = new IMove() {
            @Override
            public void move(Site from, Site to) {
                System.out.println("Таинственное перемещение из " + from + " в " + to);
            }
        };
        something.move(a, b);
        //Лямбда выражение - сокращенная запись объекта анонимного вложенного класса, реализующего интерфейс
        IMove teleport = (x, y) -> System.out.println("Телепортация из " + x + " в " + y + " мгновенно преодалевает " + x.distanceTo(y));
        teleport.move(b, a);

        teleport.move(a, new Address("Можайская", 2, 1));
    }

    //расстояние между геоточками
    private static void exemple0() {
        Site a = new GeoLoc("А", 60, 30);
        Site b = new GeoLoc("Б", 62, 29);
        System.out.println("Расстояние от " + a + " до " + b + " равно " + a.distanceTo(b));

        Site c = new City("Питер");
        Site d = new City("Москва");
        System.out.println("Расстояние от " + c + " до " + d + " равно " + c.distanceTo(d));
        System.out.println("Расстояние от " + a + " до " + d + " равно " + a.distanceTo(d));

    }
}
