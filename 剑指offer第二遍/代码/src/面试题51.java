public class 面试题51 {
    public class Solution {

        public int InversePairs(int[] array) {
            if (array == null || array.length == 0) return 0;
            return InversePairsCore(array, 0, array.length - 1);
        }

        public int InversePairsCore(int[] array, int left, int right) {
            if (left == right)
                return 0;
            int mid = left + (right - left) / 2;
            int count_left = InversePairsCore(array, left, mid)%1000000007;
            int count_right = InversePairsCore(array, mid + 1, right)%1000000007;
            int[] temp = new int[right - left + 1];
            int index1 = mid;
            int index2 = right;
            int count = 0;
            int i = temp.length - 1;

            while (index1 >= left && index2 >= mid + 1) {
                if (array[index1] > array[index2]) {
                    temp[i] = array[index1];
                    i--;
                    index1--;
                    count += index2 - mid;
                    if(count>=1000000007)//数值过大求余
                    {
                        count%=1000000007;
                    }
                } else {
                    temp[i] = array[index2];
                    i--;
                    index2--;
                }
            }
            while (index1 >= left) {
                temp[i] = array[index1];
                i--;
                index1--;
            }
            while (index2 >= mid + 1) {
                temp[i] = array[index2];
                i--;
                index2--;
            }
            i = 0;
            for (int j = left; j <= right; j++) {
                array[j] = temp[i];
                i++;
            }
            return (count_left + count_right + count)%1000000007;
        }
    }
}
