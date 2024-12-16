class Latte extends CoffeeMachine {
    @Override
    protected void brewCoffee() {
        System.out.println("Brewing coffee for a Latte...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding steamed milk...");
    }
}

