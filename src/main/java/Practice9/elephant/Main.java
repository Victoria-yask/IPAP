package Practice9.elephant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class Main {

    static void main() {
        exemple1();
    }

    public static void exemple1() {
        List<Elephant> list0 = List.of(new Elephant("Хатхи", 20, 1.5, 450),
                new Elephant("Раджа", 25, 1, 350),
                new Elephant("Леночка", 3, 0.5, 500));
        list0.getLast().age++;//элемент в списке можно изменить
        System.out.println(list0);
        //добавить элемент нельзя
        //List.of- неизменяемая коллекция
        List<Elephant> herd = new ArrayList<>(list0);//ссылки на слонов скопируются в модифицируемую коллекцию

        //как упорядочить слонов
        //метод sort() принимает алгоритм сравнения 2-хсущностей - элементов списка

        //herd.sort(new Comparator<Elephant>() {
        //    @Override
        //    public int compare(Elephant o1, Elephant o2) {
        //       return Double.compare(o1.trunkLenght, o2.trunkLenght);
        //    }
        //});
        //короткая версия
        herd.sort(Comparator.comparingDouble(el -> el.trunkLenght));
        System.out.println("herd " + herd);

        //herd.sort(Comparator.comparingDouble(new ToDoubleFunction<Elephant>() {
        //    @Override
        //    public double applyAsDouble(Elephant value) {
        //        return value.weight;
        //    }
        //}));
        //короткая версия
        herd.sort(Comparator.comparingDouble(value -> value.weight));
        System.out.println("herd " + herd);

       //herd.sort(new Comparator<Elephant>() {
       //     @Override
       //     public int compare(Elephant o1, Elephant o2) {
       //         return 0;
       //     }
       //});
        //короткая версия
        herd.sort(Comparator.comparing(o -> o.name));
        System.out.println("herd " + herd);

        //herd.sort(Comparator.comparingInt(el -> el.getAge()));
        //короткая версия
        herd.sort(Comparator.comparingInt(Elephant::getAge));
        System.out.println("herd " + herd);

    }
}
