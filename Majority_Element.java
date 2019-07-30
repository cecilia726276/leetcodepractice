import org.junit.Assert;
import org.junit.Test;

/**
 * @Author SYZ
 * @create 2019-07-26 21:24
 */
public class Majority_Element {
    // 时间复杂度就变成了O(n)，空间复杂度为O(1)

    @Test
    public void test(){
        Assert.assertEquals(1, majorityElement(new int[]{3,3,3,1,1,1,1}));
    }

    public int majorityElement(int[] nums){
        int current = 0;
        int count = 0;
        for (int num: nums){
            if (count == 0){
                current = num;
                count = 1;
            } else {
                if (current == num){
                    count++;
                } else {
                    count--;
                }
            }
        }
        return current;
    }
}
