public class Demo50_test {
    public static void main(String[] args) {
        int[] array = {2,3,1,0,2,5,3};
        int[] duplication = {0};
        boolean result = duplicate(array, array.length, duplication);
        System.out.println(result);
        System.out.println(duplication[0]);
    }
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        //代码鲁棒性
        if(numbers==null||length==0){
            return false;
        }
        //边界问题，保证所有数字是在 0 到 n-1 之间
        //进行for循环
        for (int i = 0;i<numbers.length;i++){
            if (numbers[i]>=length||numbers[i]<0){
                return false;
            }
        }
        for (int j = 0;j<length;j++){
            //如果出现number[i]==number[number[i]]的情况说明出现重复数字
            while (numbers[j]!=j){
                if (numbers[j]==numbers[numbers[j]]){
                    duplication[0] = numbers[j];
                    //赋值返回true
                    return true;
                }
                //否则寻找所在位置的索引进行交换
                int temp = numbers[j];
                numbers[j] = numbers[temp];
                numbers[temp] = temp;
            }
        }
        return false;
    }
}
