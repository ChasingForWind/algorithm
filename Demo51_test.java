public class Demo51_test {
    public static void main(String[] args) {
        String s = LeftRotateString("abcDEF", 9);
        System.out.println(s);
    }
    public static String LeftRotateString(String str,int n) {
        //代码鲁棒性
        if(str.length()<0||str==null){
            return "";
        }
        n = n % str.length();
        //新建一个stringbuilder
        StringBuilder sb = new StringBuilder("");
        //用substring截取前一半
        String substring = str.substring(0, n);
        //用substring截取后一半
        sb.append(str.substring(n,str.length()));
        //拼接
        sb.append(substring);
        return sb.toString();
    }
}
