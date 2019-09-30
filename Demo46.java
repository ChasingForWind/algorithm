public class Demo46 {
    /*求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
    ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。*/
    public class Solution {
        public int NumberOf1Between1AndN_Solution(int n) {
            //再进行归纳后可以得出核心算法
            //count(i) = n/(i*10)*i + Math.min(Math.min(k-i+1,0),i)
            if (n<=0) return 0;
            int count=0;
            for (int i=1;i<=n;i=i*10){
                int k = n%(i*10);
                int count_temp = n/(i*10)*i + Math.min(Math.max(k-i+1,0),i);
                count = count+count_temp;
            }
            return count;
        }
    }
}
