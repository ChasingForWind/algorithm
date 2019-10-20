public class demo_test {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 3, 8};
        int left = 2;
        int size = 6;
        System.out.println("array[left]:"+array[left] +"    "+ "array[left + 1]:"+array[left+1]);
        System.out.println(left + 1 < size);
        int largest1 = left + 1 < size && array[left] > array[left+1] ? left  :  left + 1;
        int largest2 = left + 1 < size && array[left + 1] > array[left] ? left + 1 : left;
        System.out.println(largest1);
        System.out.println(largest2);
    }
}
