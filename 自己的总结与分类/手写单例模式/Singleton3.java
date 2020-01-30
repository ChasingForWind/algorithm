package 手写单例模式;
/*饿汉模式*/
public class Singleton3 {
    private static Singleton3 uniqueSingleton3 = new Singleton3();

    private Singleton3(){};

    public static Singleton3 getUniqueSingleton3() {
        return uniqueSingleton3;
    }
}
