package 装饰者模式.starbuzz;

/**
 * @author admin
 */
public class Mocha extends CondimentDecorator{
    //被装饰者
    private Beverage beverage;


    /**
     * 要让Mocha能够引用一个Beverage，结论如下：
     *      （1）用一个实例变量记录饮料，也就是被装饰者。
     *       （2）想办法让被装饰者（饮料）被记录到实例变量中。这里的做法是：把饮料当作构造器的参数。
     *       再由构造器将此饮料记录在实例变量中
     * @param beverage 饮料
     */
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }


    /**
     * 我们希望叙述不只是描述饮料（例如“DarkRoast”），而是完整地连调料都描述出来（）
     * 所以利用委托的做法，得到一个叙述，然后在其后加上附加的叙述（例如“MOKA”）
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.99;
    }


}
