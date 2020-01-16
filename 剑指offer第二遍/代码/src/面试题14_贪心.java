public class 面试题14_贪心 {
    public class Solution {
        public int cutRope(int target) {
            if(target<2) return 0;
            if (target==2) return 1;
            if(target==3) return 2;

            int res = target%3;

            if (res==0) return (int)Math.pow(3,target/3);
            else if (res==1) return (int)Math.pow(3,target/3-1)*4;
            else return (int) Math.pow(3,target/3)*2;
        }
    }
}
