package 单例模式.懒汉式;

public class SingletonPattern {
    public static void main(String[] args) {

    }
}


class Singleton{
    private static Singleton singleton;
    private Singleton(){}

    public synchronized static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}