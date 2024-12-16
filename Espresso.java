class Espresso extends CoffeeMachine {
    @Override
    protected void brewCoffee() {
        System.out.println("Brewing a strong shot of espresso...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("No condiments needed for Espresso.");
    }
}

