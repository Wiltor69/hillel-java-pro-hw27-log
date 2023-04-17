package ua.hillel.coffee.order;

public interface CoffeeOrder {
    void add(Order order);
    void deliver (int id);
    void draw (CoffeeOrderBoard coffeeOrderBoard);
}
