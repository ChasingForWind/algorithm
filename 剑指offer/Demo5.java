import org.junit.Test;

public class Demo5 {
    public static void main(String[] args) {
        StringBuffer str =new StringBuffer("hello world");
        String s = replaceSpace(str);
        System.out.println(s);
    }
    @Test
    public static String replaceSpace(StringBuffer str) {

        //确保null情况的代码健壮性
        if(str==null){
            return null;
        }
        //遍历确定代码中字符长度和空格长度
        int i =0;
        int bankNumber=0;
        int totalNumber;
        totalNumber=str.length();
        for (int j=0;j<totalNumber;j++){
            if(str.charAt(j)==' '){
                bankNumber++;
            }
        }
        //替换出新的长度
        int newLength=bankNumber*2+totalNumber;
        //设置指针进行指向
        int p2=newLength-1;
        int p1=p2-bankNumber*2;
        str.setLength(newLength);
        //用while循环开始替代
        while(p1>=0&&p2>p1){
            if(str.charAt(p1)==' '){
                str.setCharAt(p2--,'0');
                str.setCharAt(p2--,'2');
                str.setCharAt(p2--,'%');

            }else{
                str.setCharAt(p2,str.charAt(p1));
                p2--;
            }
            p1--;
        }
        //结束
        String s = str.toString();
        return s;
    }
}