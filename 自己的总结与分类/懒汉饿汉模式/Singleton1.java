package 懒汉饿汉模式;


/*懒汉模式*/
public class Singleton1 {
    private static Singleton1 instance = null;

    private Singleton1(){};

    public static synchronized Singleton1 getInstance(){
        if (instance==null) {
            instance = new Singleton1();
        }
        return instance;
    }

}
