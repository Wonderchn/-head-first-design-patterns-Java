package 装饰者模式.starbuzz;

public abstract class Beverage {
    String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

