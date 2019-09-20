public class Demo37 {
    /*输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
    如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。*/
    public class Solution {
        public boolean VerifySquenceOfBST(int [] sequence) {
            //保证代码鲁棒性
            if (sequence==null||sequence.length<=0) return false;
            //进入递归
            return Verify(sequence, 0, sequence.length - 1);
        }
        //递归函数
        public boolean Verify(int[] sequence,int start, int end){
            //start>=end说明递归到了尽头
            if (start>=end) return true;
            //得到root
            int root = sequence[end];
            //判断找出左子树区域
            int i=start;
            while (sequence[i]<root){
                i++;
            }
            //判断找出右子树区域
            int j=i;
            while (j<end){
                if (sequence[j]<root) return false;
                j++;
            }
            //左右递归
            boolean left = Verify(sequence,start,i-1);
            //返回结果
            boolean right = Verify(sequence,i,end-1);
            return left&&right;
        }
    }
}
