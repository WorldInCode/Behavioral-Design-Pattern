public class Main {
    public static void main(String[] args) {
        System.out.println("Preparing Espresso:");
        CoffeeMachine espresso = new Espresso();
        espresso.prepareCoffee();

        System.out.println("\nPreparing Latte:");
        CoffeeMachine latte = new Latte();
        latte.prepareCoffee();
    }
}

