package Practice8;
//абстрактный класс, место
public abstract class Site {

    //псевдоним
    protected String alias;

    public Site(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

//расстояние, принимает другое место
    public abstract double distanceTo(Site to);
}
