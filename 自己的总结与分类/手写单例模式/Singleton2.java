package 手写单例模式;

/*满足多线程下，对性能要求不高时*/

public class Singleton2 {
    private static Singleton2 uniqueSingleton2;

    private Singleton2(){}

    public static synchronized Singleton2 getUniqueSingleton2() {
        if (uniqueSingleton2==null){
            uniqueSingleton2 = new Singleton2();
        }
        return uniqueSingleton2;
    }
}
