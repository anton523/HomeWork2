import java.util.ArrayList;

public class Food {
    private int taste;
    private int weightInGr;
    public Food(int taste, int weight) {
        this.taste = taste;
        this.weightInGr = weight;
    }

    public int getTaste() {
        return taste;
    }

    public int getWeightInGr() {
        return weightInGr;
    }

    @Override
    public String toString() {
        return getClass() +
                "{t=" + taste +
                ", w=" + weightInGr +
                '}';
    }
}
