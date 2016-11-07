package org.webonise.lambdaexpression1;

public class Apple {
    //considering weight of Apple is integer type only.
    private final int weight;
    private final String color;
    private final int id;

    public Apple(final int weight, final String color, final int id) {
        this.weight = weight;
        this.color = color;
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }
}
