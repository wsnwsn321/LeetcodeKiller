package src.com.company;

public class Solution240_Searcha2DMatrixII {
    public static void main(String[] args) {

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0, col = n-1;
        while(row<m&&col>=0){
            if (matrix[row][col]==target) return true;
            else if (matrix[row][col]>target) col--;
            else row++;
        }
        return false;

    }
}
