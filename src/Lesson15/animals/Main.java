package Lesson15.animals;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    static void main() {

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Барсик", "черный"));
        cats.add(new Cat("Мурка", "серая"));
        cats.add(new Cat("Васька", "белый"));

        ArrayList<Lion> lions = new ArrayList<>();
        lions.add(new Lion("Симба", "черный"));
        lions.add(new Lion("Майкл", "серый"));

        ArrayList<Giraffe> giraffes = new ArrayList<>();
        giraffes.add(new Giraffe("Матвей", "черный"));
        giraffes.add(new Giraffe("Эдуард", "белый"));
        giraffes.add(new Giraffe("Веня", "желтый"));
        giraffes.add(new Giraffe("Иннокентий", "белый"));

        System.out.println(giraffes);

        //для 1 льва
        Lion.huntingGiraffe(giraffes);

        //для всех львов
        //for (Lion l : lions) {
        //    l.huntingGiraffe(giraffes);
         //   System.out.println(giraffes);
        //}

        giraffes.sort(Comparator.comparing(Giraffe::getName));
        System.out.println(giraffes);
    }

    public static ArrayList<Mammal> merge (ArrayList < Cat > cats, ArrayList < Lion > lions, ArrayList < Giraffe > giraffes)
    {
        ArrayList<Mammal> list = new ArrayList<>();
        list.addAll(cats);
        list.addAll(lions);
        list.addAll(giraffes);
        return list;
    }

}

