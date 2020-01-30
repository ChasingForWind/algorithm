package 手写单例模式;

/*
单例模式是设计模式中最简单的形式之一。这一模式的目的是使得类的一个对象成为系统中的唯一实例。

单例模式是一种常用的设计模式，该模式提供了一种创建对象的方法，确保在程序中一个类最多只有一个实例。*/
public class Singleton {
    private static Singleton uniqueSingleton;

    private Singleton(){};

    public static Singleton getInstance(){
        if (uniqueSingleton==null){
            Singleton uniqueSingleton = new Singleton();
        }
        return uniqueSingleton;
    }
}
