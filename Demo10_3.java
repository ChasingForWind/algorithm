public class Demo10_3 {
    public int JumpFloorII(int target) {
        if(target<1) return 0;
        return (int) Math.pow(2,target-1);
    }
}
