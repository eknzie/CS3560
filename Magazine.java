public interface SaleableItem {
    void sellCopy();
}

public class Magazine implements SaleableItem {
    public Magazine() {}

    public void sellCopy() {
        System.out.println("Selling a magazine");
    }
}

public class Ticket implements SaleableItem {
    public Ticket() {}

    public void sellCopy() {
        System.out.println("Selling a ticket");
    }
}