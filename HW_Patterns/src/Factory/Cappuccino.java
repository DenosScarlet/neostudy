package Factory;

public class Cappuccino implements ICoffee{
    @Override
    public void makeCoffee() {
        System.out.println("Готовлю Капучино...");;
    }
}
