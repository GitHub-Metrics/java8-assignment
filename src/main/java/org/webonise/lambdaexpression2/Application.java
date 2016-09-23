package org.webonise.lambdaexpression2;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    static final Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {

        Application application = new Application();
        List<Apple> apples = application.generateApples();

        AppleFilter appleFilter1 = (apple) -> apple.getWeight() < 3;
        application.prettyPrintApples(apples, appleFilter1);

        logger.log(Level.INFO, "==================================================");

        AppleFilter appleFilter2 = (apple) -> apple.getColor().equals("red") && apple.getWeight() < 3;
        application.prettyPrintApples(apples, appleFilter2);
    }

    public void prettyPrintApples(List<Apple> apples, AppleFilter appleFilter) {

        for (Apple apple : apples) {
            if (appleFilter.test(apple)) {
                logger.log(Level.INFO, "Apple " + apple.getId() + " : " + apple.getColor() + ", " + apple.getWeight());
            }
        }
    }

    public List<Apple> generateApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(5, "green", 1));
        apples.add(new Apple(4, "red", 2));
        apples.add(new Apple(1, "green", 3));
        apples.add(new Apple(2, "red", 4));
        apples.add(new Apple(3, "green", 5));
        apples.add(new Apple(2, "red", 6));

        return apples;
    }
}