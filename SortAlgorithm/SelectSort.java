package SortAlgorithm;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author SYZ
 * @create 2019-08-08 03:05
 */
public class SelectSort {

    @Test
    public void test(){
        int[] solution = {1,2,3,4,5,6};
        Assert.assertArrayEquals(solution, insertionSort02(new int[]{6,5,2,1,3,4}));
    }

    // 交换次数较多
    public static int[] insertionSort01(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int temp = arr[i];
            for (int j = i; j >= 0; j--){
                if (j > 0 && arr[j] < arr[j-1]){
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    // 交换次数较少
    public static int[] insertionSort02(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            for(int j = i; j >=0; j--){
                if(j > 0 && arr[j-1] > temp){
                    arr[j] = arr[j-1];
                } else {
                    arr[j] = temp;
                    break;
                }
            }
        }
        return arr;
    }

}
