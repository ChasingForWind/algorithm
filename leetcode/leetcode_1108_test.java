package leetcode;

public class leetcode_1108_test {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String s = defangIPaddr(address);
        System.out.println(s);

    }
    public static String defangIPaddr(String address) {
        char[] chars = address.toCharArray();
        StringBuilder result = new StringBuilder();
//            char[] result = new char[chars.length + 3 * 2];2
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='.'){
                result.append('[').append('.').append(']');
            }else{
                result.append(chars[i]);
            }
        }
        return result.toString();
    }
}
