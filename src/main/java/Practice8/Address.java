package Practice8;

public class Address extends Site {
    String street;
    int building;
    int apartment;

    public Address(String street, int building, int apartment) {
        super("");
        this.street = street;
        this.building = building;
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", building=" + building +
                ", apartment=" + apartment +
                '}';
    }

    //расстояние между домами
    @Override
    public double distanceTo(Site to) {
        System.out.println("Пока не научились считать расстояния");
        return 0;
    }
}
