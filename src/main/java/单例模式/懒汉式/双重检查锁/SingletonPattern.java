package 单例模式.懒汉式.双重检查锁;

public class SingletonPattern {
    public static void main(String[] args) {

    }
}


class Singleton{
    private  static volatile Singleton singleton;
    private Singleton(){}

    public  static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }

            }
        }
        return singleton;
    }
}