package SortAlgorithm;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author SYZ
 * @create 2019-08-08 03:05
 */
public class QuickSort {
    @Test
    public void test(){
        int[] solution = {1,2,3,4,5,6};
        Assert.assertArrayEquals(solution, quickSort(new int[]{6,5,2,1,3,4}));
    }

    public int[] quickSort(int[] array){
        quickSort(array, 0, array.length-1);
        return array;
    }

//    public void quickSort(int[] array, int low, int high){
//        if (low < high) {
//            int p_value = array[low];
//            int[] temp = new int[high - low + 1];
//            int t_low = 0;
//            int t_high = high - low;
//            for (int i = low + 1; i <= high; i++) {
//                if (t_low == t_high) {
//                    break;
//                }
//                if (p_value > array[i]) {
//                    temp[t_low++] = array[i];
//                } else {
//                    temp[t_high--] = array[i];
//                }
//            }
//            System.out.println("low: " + low + "t"+ t_low);
//            System.out.println("high: " +high+ "t"+ t_high);
//            temp[t_high] = p_value;
//            for (int i = 0; i <= high - low; i++) {
//                array[low + i] = temp[i];
//            }
//
//            quickSort(array, low, low+ t_low - 1);
//            quickSort(array, low+t_low + 1, high);
//
//        }
//    }

    public void quickSort(int[] array, int low, int high){
        if(low < high){
            int pivot = array[low];
            int low_pointer = low;
            int high_pointer = high;
            while (low_pointer < high_pointer){
                while (low_pointer < high_pointer && array[high_pointer] > pivot){
                    high_pointer--;
                }
                array[low_pointer] = array[high_pointer];
                while (low_pointer < high_pointer && array[low_pointer] < pivot){
                    low_pointer++;
                }
                array[high_pointer] = array[low_pointer];
            }
            array[low_pointer] = pivot;

            quickSort(array,low,low_pointer-1);
            quickSort(array,low_pointer+1,high);
        }
    }
}
