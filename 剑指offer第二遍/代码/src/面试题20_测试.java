public class 面试题20_测试 {
    public static void main(String[] args) {
        面试题20 test = new 面试题20();
        面试题20.Solution solution = test.new Solution();
        char[] chars = "123.45e+6".toCharArray();
        boolean numeric = solution.isNumeric(chars);
        System.out.println(numeric);

    }
}
