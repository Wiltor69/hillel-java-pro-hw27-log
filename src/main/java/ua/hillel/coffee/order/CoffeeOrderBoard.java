package ua.hillel.coffee.order;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Loader;

import java.util.List;

public class CoffeeOrderBoard implements CoffeeOrder{
    private List<Order> orderList;
    private static final Logger LOGGER = LogManager.getLogger(CoffeeOrderBoard.class);


    @Override
    public void add(Order order) {
    LOGGER.info("Method add");
        orderList.add(order);
        LOGGER.debug("Order add {}", order);


    }

    @Override
    public void deliver(int id) {

                System.out.println(orderList.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .get());
        orderList.removeIf(u -> u.getId() == id);
    }

    @Override
    public void draw(CoffeeOrderBoard coffeeOrderBoard) {
        LOGGER.info("Method draw");
//        System.out.println(orderList);
        LOGGER.debug("Order {}", orderList);
    }
}
