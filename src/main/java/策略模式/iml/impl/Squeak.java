package 策略模式.iml.impl;

import 策略模式.iml.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
