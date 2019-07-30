import org.junit.Assert;
import org.junit.Test;

/**
 * @Author SYZ
 * @create 2019-07-26 21:54
 */
public class Search_Matrix {
    @Test

    public void test01(){
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};

        Assert.assertEquals(true, searchMatrix(matrix, 5));

    }
    @Test
    public void test02(){
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        Assert.assertEquals(false, searchMatrix(matrix, 20));
    }

    public boolean searchMatrix(int[][] matrix, int target){
        if (matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int row = matrix.length;
        int column = matrix[0].length;
        int current_row = 0;
        int current_column = matrix[0].length-1;
        int current = matrix[current_row][current_column];
        while (current != target){
            if (current < target){
                current_row ++;
                if (current_row == row){
                    return false;
                }
            } else {
                current_column --;
                if (current_column == -1){
                    return false;
                }
            }
            current = matrix[current_row][current_column];
        }
        return true;
    }
}
