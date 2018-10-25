public class Mustang implements Horse {
    private String name;
    private int weight;
    public Mustang(String n, int w)
    {
        this.name = n;
        this.weight = w;
    }
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
