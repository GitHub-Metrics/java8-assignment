package org.webonise.lambdaexpression1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    static final Logger logger = Logger.getLogger(Application.class.getName());
    static final int HEAVY_BENCHMARK = 3;

    public static void main(String[] args) {

        Application application = new Application();
        List<Apple> apples = application.generateApples();

        ApplePrinter weightPrinter = (apple) -> Integer.toString(apple.getWeight());
        application.prettyPrintApples(apples, weightPrinter);

        logger.log(Level.INFO, "==================================================");

        ApplePrinter segregateWeightPrinter = (apple) -> apple.getWeight() + " is " + (apple.getWeight() < HEAVY_BENCHMARK ? "LIGHT" : "HEAVY");
        application.prettyPrintApples(apples, segregateWeightPrinter);
    }

    public void prettyPrintApples(List<Apple> apples, ApplePrinter applePrinter) {
        for (Apple apple : apples) {
            logger.log(Level.INFO, "Apple " + apple.getId() + " : " + applePrinter.getStringToPrint(apple));
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
