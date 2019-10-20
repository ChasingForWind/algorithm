package leetcode;

public class leetcode_657_test {
    public static void main(String[] args) {
        String s = "UD";
        judgeCircle(s);
    }
    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        //处理字符串
        char[] chars = moves.toCharArray();
        //循环判断
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'U':
                    y = y + 1;
                    break;
                case 'D':
                    y = y - 1;
                    break;
                case 'L':
                    x = x - 1;
                    break;
                case 'R':
                    x = x+ 1;
                    break;
            }
        }
        //判断是否是原点
        if (x == 0 && y == 0) return true;
        else return false;
    }
}
