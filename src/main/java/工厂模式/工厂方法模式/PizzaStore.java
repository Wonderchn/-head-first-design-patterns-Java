package 工厂模式.工厂方法模式;

public abstract class PizzaStore {
    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type){
        Pizza pizza1 = createPizza(type);
        Pizza pizza = pizza1;
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}