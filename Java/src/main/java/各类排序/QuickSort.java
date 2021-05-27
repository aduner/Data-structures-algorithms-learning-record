package 各类排序;


/**
 * 快速排序
 * @author Aduner
 */
public class QuickSort {
    public static void sort(int arr[], int left, int right) {
        if (arr == null || arr.length <= 0 || left >= right) return;
        int l = left;
        int r = right;
        int v = arr[l];
        while (l < r) {
            while (l < r && arr[r] >= v) r--;
            while (l < r && arr[l] <= v) l++;
            if (l < r) swap(arr, l, r);
        }
        swap(arr,left,l);
        sort(arr,left,l-1);
        sort(arr,l+1,right);
    }

    public static void swap(int arr[], int l, int r) {
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }
}
