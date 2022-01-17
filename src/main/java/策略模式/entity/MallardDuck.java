package 策略模式.entity;

import 策略模式.abs.Duck;
import 策略模式.iml.impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a MallardDuck");
    }
}
