package 工厂模式.工厂方法模式;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {

        switch (item) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }

    }
}