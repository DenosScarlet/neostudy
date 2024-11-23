package Factory;

public class Latte implements ICoffee{
    @Override
    public void makeCoffee() {
        System.out.println("Готовлю Латте...");
    }
}
