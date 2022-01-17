package 装饰者模式.demo1;


public class Whip extends  CondimentDecorator{
    private Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
