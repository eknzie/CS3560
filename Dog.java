import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String breed;
    private String name;
    private List<Paw> paws;

    public Dog() {
        paws = new ArrayList<>();
    }

    public void addPaw(Paw paw) {
        if (paws.size() < 4) {
            paws.add(paw);
        }
    }
}

public class Paw {
    private int position;

    public Paw(int position) {
        this.position = position;
    }
}