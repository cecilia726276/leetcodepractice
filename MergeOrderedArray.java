import org.junit.Assert;
import org.junit.Test;

/**
 * @Author SYZ
 * @create 2019-07-26 22:20
 */
public class MergeOrderedArray {
    /**
     * 	给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
     * 	说明:
     * 		• 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
     * 		• 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     * 	示例:
     * 	输入:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * 	输出: [1,2,2,3,5,6]
     */

    @Test
    public void test(){
        int[] nums1 = {1,2,3,0,0,0,0,0,0};
        int[] nums2 = {2,5,6};
        int[] outcome = {1,2,2,3,5,6,0,0,0};
        Assert.assertArrayEquals(outcome, merge(nums1, 3, nums2, 3));
    }

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int startingPos = m+n-1;
        while ( m != 0 && n != 0){
            if (nums1[m-1] <= nums2[n-1]){
                nums1[startingPos] = nums2[n-1];
                n--;
                startingPos--;
            }else{
                nums1[startingPos] = nums1[m-1];
                m--;
                startingPos--;
            }
        }
        if (m == 0){
            while(n != 0){
                nums1[startingPos] = nums2[n-1];
                n--;
                startingPos--;
            }
        }
        return nums1;
    }

}
