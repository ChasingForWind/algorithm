public class 面试题53 {
    public class Solution {
        public int GetNumberOfK(int [] array , int k) {
            if (array==null||array.length==0) return 0;
            int left = GetNumLeft(array,k);
            int right = GetNumRight(array,k);
            if (left==-1||right==-1) return 0;
            else return right-left+1;
        }
        public int GetNumLeft(int[] array,int k){
            if (array==null||array.length==0) return 0;
            int left = 0;
            int right = array.length-1;
            int mid = 0;
            while (left<right){
                mid = left+(right-left)/2;
                if (array[mid]<k){
                    left = mid+1;
                }else if (array[mid]>k){
                    right = mid-1;
                }else {
                    if (mid-1>=0 &&array[mid-1]==array[mid]){
                        right = mid-1;
                    }else {
                        return mid;
                    }
                }
            }
            if (array[left]==k) return left;
            else return -1;
        }
        public int GetNumRight(int[] array,int k){
            if (array==null||array.length==0) return 0;
            int left = 0;
            int right = array.length-1;
            int mid = 0;
            while (left<right){
                mid = left+(right-left)/2;
                if (array[mid]<k){
                    left = mid+1;
                }else if (array[mid]>k){
                    right = mid-1;
                }else {
                    if (mid+1<=array.length-1 &&array[mid+1]==array[mid]){
                        left = mid+1;
                    }else {
                        return mid;
                    }
                }
            }
            if (array[left]==k) return left;
            else return -1;
        }
    }
}
