package Factory;

public class CoffeFactory {
    public ICoffee getCoffee(CoffeType coffeType) {
        ICoffee iCoffee;
        switch (coffeType) {
            case LATTE: iCoffee = new Latte();
                break;
            case ESPRESSO: iCoffee = new Espresso();
                break;
            case AMERICANO: iCoffee = new Americano();
                break;
            case CAPPUCCINO: iCoffee = new Cappuccino();
                break;
            default: throw new IllegalArgumentException("Неверный тип кофе");
        }
        return iCoffee;
    }
}
