package 虚拟机调优.垃圾回收;

public class finalize方法 {
    public static void main(String[] args) {
        for (int i = 0; i < 5000000; i++) {
            new demo1();
            System.gc();
        }
    }
}
class demo1 extends Object{
    @Override
    public void finalize(){
        System.out.println("垃圾被回收了");
    }
}
