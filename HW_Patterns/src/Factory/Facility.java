package Factory;

public class Facility {

    private final CoffeeGrinder coffeeGrinder;

    public Facility(CoffeeGrinder coffeeGrinder){
        this.coffeeGrinder = coffeeGrinder;
    }

    public void start(CoffeType coffeType) {
        CoffeFactory coffeFactory = new CoffeFactory();
        ICoffee iCoffee = coffeFactory.getCoffee(coffeType);
        orderHandler();
        preparations();
        coffeeGrinder.grind(iCoffee);
        iCoffee.makeCoffee();

    }
    private void preparations(){
        System.out.println("Начинаю приготовления...");
    }


    private void orderHandler() {
        System.out.println("Заказ принят");
    }
}
