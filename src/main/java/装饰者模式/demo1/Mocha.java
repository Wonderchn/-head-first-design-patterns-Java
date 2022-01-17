package 装饰者模式.demo1;

/**
 * @author admin
 */
public class Mocha extends CondimentDecorator{
    //被装饰者
    private Beverage beverage;

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.99;
    }

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
}
