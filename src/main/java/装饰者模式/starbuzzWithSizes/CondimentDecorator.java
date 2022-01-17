package 装饰者模式.starbuzzWithSizes;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    @Override
    public abstract String getDescription();

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}