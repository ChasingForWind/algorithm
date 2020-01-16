public class 面试题13_测试 {
    public static void main(String[] args) {
        面试题13 test = new 面试题13();
        面试题13.Solution solution = test.new Solution();
        int count = solution.movingCount(5, 10, 10);
        System.out.println(count);
    }
}
