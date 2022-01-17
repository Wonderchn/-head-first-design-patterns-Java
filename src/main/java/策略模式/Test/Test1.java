package 策略模式.Test;

import 策略模式.abs.Duck;
import 策略模式.entity.MallardDuck;

public class Test1 {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
    }
}
