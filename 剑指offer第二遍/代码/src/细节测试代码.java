import classes.TreeNode;

public class 细节测试代码 {
    public static void main(String[] args) {
        快排 test = new 快排();
        快排.Solution solution = test.new Solution();
        int[] nums = {5,2,3,1};
        solution.sortArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

    }
}
