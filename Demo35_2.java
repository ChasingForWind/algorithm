public class Demo35_2 {
    /*二分法*/
    public class Solution {
        public int GetNumberOfK(int [] array , int k) {
            //保证代码的鲁棒性
            if(array.length==0) return 0;
            //递归找到相同的数字的最左边一个leftK
            int leftK = getLeftIndex(array,k,0,array.length-1);
            //递归找到相同的数字的最右边一个ringtK
            int rightK = getRightIndex(array,k,0,array.length-1);
            //返回具体数值
            if (leftK!=-1&&rightK!=-1){
                return rightK-leftK+1;
            }
                return 0;

        }

        public int getLeftIndex(int [] array,int k,int start,int end){
            //出口1
            if(start>end) return -1;
            //定义mid值
            int mid = (start+end)>>1;
            //如果mid值大于k值 mid-1给end
            if (array[mid]>k) return getLeftIndex(array,k,start,mid-1);
            //如果mid值小于k值mid+1给start
            else if (array[mid]<k) return getLeftIndex(array,k,mid+1,end);
            //如果mid值等于k值，则比较array[mid-1]和k 如果相等，则把mid-1赋给end
            else if ((mid-1)!=-1&&array[mid-1]==k) return getLeftIndex(array,k,start,mid-1);
            //出口2
            else return mid;
        }
        public int getRightIndex(int [] array,int k,int start,int end){
            //出口1
            if(start>end) return -1;
            //定义mid值
            int mid = (start+end)>>1;
            //如果mid值大于k值 mid-1给end
            if (array[mid]>k) return getRightIndex(array,k,start,mid-1);
                //如果mid值小于k值mid+1给start
            else if (array[mid]<k) return getRightIndex(array,k,mid+1,end);
                //如果mid值等于k值，则比较array[mid+1]和k 如果相等，则把mid+1赋给start
            else if ((mid+1)<array.length&&array[mid+1]==k) return getRightIndex(array,k,mid+1,end);
                //出口2
            else return mid;
        }

    }
}
