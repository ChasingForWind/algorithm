public class 面试题3_解法3 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        //代码鲁棒性
        if (numbers==null||length<=0) return false;
        //定义start end
        int start = 0;
        int end = length-1;
        //while循环
        while (start<end){
            int middle = start+(end-start)/2;
            if (findCount(numbers,start,middle)>middle-start+1){
                end = middle;
            }else {
                start = middle+1;
            }
        }
        //跳出循环后再次寻找出现次数
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            if (numbers[i]==start) count++;
        }
        if (count>1) {
            duplication[0] = start;
            return true;
        }
        else return false;
        //返回
    }
    //写一个在一个范围内查找出现次数的函数
    public int findCount(int numbers[],int start,int end){
        if (numbers==null) return 0;
        int count=0;
        for (int i = start; i < numbers.length; i++) {
            if (numbers[i]>=start&&numbers[i]<=end)
                count++;
        }
        return count;
    }
}
