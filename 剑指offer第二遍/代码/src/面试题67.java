public class 面试题67 {
    /*跳台阶*/
    public class Solution {
        public int JumpFloor(int target) {
            if (target==1) return 1;
            if (target==2) return 2;
            return JumpFloor(target-1)+JumpFloor(target-2);
        }
    }
}
