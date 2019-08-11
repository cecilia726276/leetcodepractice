package SortAlgorithm;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author SYZ
 * @create 2019-08-08 03:05
 */
public class BubbleSort {
    @Test
    public void test(){
        int[] solution = {1,2,3,4,5,6};
        Assert.assertArrayEquals(solution, bubbleSort(new int[]{6,5,2,1,3,4}));
    }

    public static int[] bubbleSort(int[] array){
        for(int i = array.length - 1; i >= 0; i--){
            for (int j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
