package 懒汉饿汉模式;


public class Singleton1_2 {
    private Singleton1_2(){}
    private static class inner{
        private static final Singleton1_2 INSTANCE = new Singleton1_2();
    }
    public static Singleton1_2 getInstance(){
        return inner.INSTANCE;
    }
}
