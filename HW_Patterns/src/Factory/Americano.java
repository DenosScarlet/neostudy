package Factory;

public class Americano implements ICoffee{
    @Override
    public void makeCoffee() {
        System.out.println("Готовлю Американо...");
    }
}
