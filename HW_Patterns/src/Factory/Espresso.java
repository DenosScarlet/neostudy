package Factory;

public class Espresso implements ICoffee{
    @Override
    public void makeCoffee() {
        System.out.println("Готовлю Эспрессо...");
    }
}
