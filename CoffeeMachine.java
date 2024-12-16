abstract class CoffeeMachine {
    // Template method
    public final void prepareCoffee() {
        heatWater();
        brewCoffee();
        pourInCup();
        addCondiments();
        serve();
    }

    private void heatWater() {
        System.out.println("Heating water...");
    }

    private void pourInCup() {
        System.out.println("Pouring coffee into cup...");
    }

    private void serve() {
        System.out.println("Serving the coffee!");
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void brewCoffee();

    protected abstract void addCondiments();
}

