package 常量池研究;

public class Demo1 {
    public static void main(String[] args) {
        Integer integer1 = new Integer(11);
        Integer integer2 = new Integer(11);


        Integer integer11 = 11;
        Integer integer22 = 11;

        System.out.println(integer1==integer2);
        System.out.println(integer11==integer22);
    }
}
