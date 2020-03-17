import java.util.Stack;

public class 面试题39 {
    public class Solutiosn {
        //投票算法
        public int MoreThanHalfNum_Solution(int [] array) {
            if (array.length==0||array==null) return 0;
            int temp=array[0];
            int time = 0;
            for (int i=0;i<array.length;i++){
                if (time==0){
                    temp = array[i];
                    time++;
                }else if (temp==array[i]){
                    time++;
                }else {
                    time--;
                }
            }
            //验证
            time=0;
            for (int i = 0; i < array.length; i++) {
                if (array[i]==temp) time++;
            }
            if (time>array.length/2) return temp;
            else
            return 0;
        }
    }
}
