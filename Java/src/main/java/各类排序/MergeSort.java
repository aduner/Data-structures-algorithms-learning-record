package 各类排序;

import java.util.Arrays;

/**
 * 归并排序
 * @author Aduner
 */
public class MergeSort {
    public static int[] sort(int[] a) {
        if (a.length <= 1) {
            return a;
        }
        int num = a.length >> 1;
        int[] left = Arrays.copyOfRange(a, 0, num);
        int[] right = Arrays.copyOfRange(a, num, a.length);
        return mergeTwoArray(sort(left), sort(right));
    }

    public static int[] mergeTwoArray(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        // 申请额外空间保存归并之后数据
        int[] result = new int[a.length + b.length];
        //选取两个序列中的较小值放入新数组
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        //序列a中多余的元素移入新数组
        while (i < a.length) {
            result[k++] = a[i++];
        }
        //序列b中多余的元素移入新数组
        while (j < b.length) {
            result[k++] = b[j++];
        }
        return result;
    }
}
