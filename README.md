# Behavioral-Design-Pattern
An example of a template method
# Coffee Machine Example: Template Method Design Pattern

This project demonstrates the Template Method design pattern using a Coffee Machine that can prepare different types of coffee like Espresso and Latte.

# Classes
CoffeeMachine.java: Abstract class defining the `prepareCoffee()` template method. Common steps such as `heatWater()`, `pourInCup()`, and `serve()` are implemented in this class. Subclasses must implement `brewCoffee()` and `addCondiments()`.
Espresso.java: Concrete class representing Espresso preparation.
Latte.java: Concrete class representing Latte preparation.
Main.java: Main class to demonstrate the pattern.

## How to Run

1. Compile all files:
   compile the main class
