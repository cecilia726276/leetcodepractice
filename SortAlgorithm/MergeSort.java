package SortAlgorithm;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author SYZ
 * @create 2019-08-08 03:04
 */
public class MergeSort {

    @Test
    public void test(){
        int[] solution = {1,2,3,4,5,6};
        Assert.assertArrayEquals(solution, mergeSort(new int[]{6,5,2,1,3,4}));
    }

    public int[] mergeSort(int[] array){
        int low = 0;
        int high = array.length-1;
        int[] newArray = split(array,low,high);
        return newArray;
    }

    public int[] split(int[] array, int low, int high){
        int mid = (low + high)/2;
        if(low < high){
            split(array, low, mid);
            split(array, mid+1, high);
            merge(array, low, mid, high);
        }
        return array;

    }

    public void merge(int[] array, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int s = 0;
        int i = low;
        int j = mid + 1;
        while(i <= mid && j <= high){
            temp[s++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        while(i <= mid){
            temp[s++] = array[i++];
        }

        while(j <= high){
            temp[s++] = array[j++];
        }

        for (int a = 0; a <= high - low; a++){
            array[low+a] = temp[a];
        }
    }

}
