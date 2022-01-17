package 策略模式.abs;

import 策略模式.iml.QuackBehavior;

public abstract class Duck {
    //表明发出的叫声
    public QuackBehavior quackBehavior;
    public Duck() {

    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void display(){

    }

    public void swim(){
        System.out.println("All duck float");
    }
}
