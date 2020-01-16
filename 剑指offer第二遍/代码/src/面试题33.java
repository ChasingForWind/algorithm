public class 面试题33 {
    public class Solution {
        public boolean VerifySquenceOfBST(int [] sequence) {
            if (sequence.length==0) return false;
            if (sequence.length==1) return true;
            return  Help(sequence,0,sequence.length-1);
        }
        public boolean Help(int[] squence,int start, int end){
            if (start>=end) return true;
            //从前往后
            int i=end;
            while (squence[i-1]>squence[end]&&i>start){
                i--;
            }
            //从后往前
            int j= start;
            for (;j<i-1;j++){
                if (squence[j]>squence[end]) return false;
            }
            return Help(squence,i,end-1)&&Help(squence,start,i-1);
        }
    }
}
