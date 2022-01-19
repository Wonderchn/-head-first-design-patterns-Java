package 单例模式.饿汉式;

public class SingletonPattern {
}



class Singleton{
    private Singleton  singleton = new Singleton();

    private Singleton(){}

    public Singleton getSingleton() {
        return singleton;
    }
}