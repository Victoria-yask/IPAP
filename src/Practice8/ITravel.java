package Practice8;

public interface ITravel extends IMove {
    void setup(Site from); //собраться
    void relax(Site to);//отдых

    default void travel(Site from, Site to){
        setup(from);//собраться в пункте отправления
        move(from, to);//
        relax(to);
    }
}
