package 各类排序;

/**
 * 希尔排序
 * @author Aduner
 */
public class ShellSort {

    public static void sort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap = gap / 2) {
            //不断缩小gap，直到1为止
            for (int j = 0; (j + gap) < arr.length; j++) {
                //使用当前gap进行组内插入排序
                for (int k = 0; (k + gap) < arr.length; k += gap) {
                    //交换操作
                    if (arr[k] > arr[k + gap]) {
                        arr[k] = arr[k] + arr[k + gap];
                        arr[k + gap] = arr[k] - arr[k + gap];
                        arr[k] = arr[k] - arr[k + gap];
                    }
                }
            }
        }
    }
}

