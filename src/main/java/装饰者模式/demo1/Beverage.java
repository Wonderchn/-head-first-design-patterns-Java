package 装饰者模式.demo1;

public abstract class Beverage {
    String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

