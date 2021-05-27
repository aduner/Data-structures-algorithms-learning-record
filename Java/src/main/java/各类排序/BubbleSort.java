package 各类排序;

/**
 * 冒泡排序
 * @author Aduner
 */
public class BubbleSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    public static void swap(int arr[], int l, int r) {
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }

    public static void main(String[] args) {
        int[] a=new int[]{5,2,3,1};
        sort(a);
        for(int x:a){
            System.out.print(x);
        }
    }
}
