package 手写单例模式;
/*用双重检查机制，实现并发情况下的高性能*/

public class Singleton4 {
    /*使用volatile关键字，确保当uniqueInstance变量被初始化成为Singleton实例时，多线程可以正确地处理uniqueInstance变量。*/
    private static volatile Singleton4 uniqueSingleton4;

    private Singleton4(){};

    public static Singleton4 getUniqueSingleton4() {
        if (uniqueSingleton4==null){
            synchronized (Singleton4.class){
                if (uniqueSingleton4==null){
                    uniqueSingleton4 = new Singleton4();
                }
            }
        }
        return uniqueSingleton4;
    }

}
