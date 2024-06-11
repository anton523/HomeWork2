public class Apples extends Food{
    private String color;

    public Apples(int taste, int weightInGr, String color) {
        super(taste, weightInGr);
        this.color=color;
    }

    @Override
    public String toString() {
        return getClass() +
                "{t=" + getTaste() +
                ", w=" + getWeightInGr() +
                " c='" + color +
                '}';
    }
}
