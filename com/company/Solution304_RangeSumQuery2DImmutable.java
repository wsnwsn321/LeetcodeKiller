package com.company;

public class Solution304_RangeSumQuery2DImmutable {
    public static void main(String[] args) {

    }

    class NumMatrix {
        int[][] curSum;
        public NumMatrix(int[][] matrix) {
            if (matrix.length == 0 || matrix[0].length == 0) return;
            curSum = new int[matrix.length+1][matrix[0].length+1];
            for (int i=0;i<matrix.length;++i){
                curSum[i][0] = matrix[i][0];
                for (int j=0;j<matrix[0].length;++j){
                    curSum[i][j+1] =curSum[i][j]+matrix[i][j];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int res =0;
//            for (int i=row1;i<=row2;++i){
//                res+=curSum[i][col2+1] - curSum[i][col1];
//            }
            //use the size from four corner points to the origin to do the area +/- to get the result
            //Sum(ABCD)=Sum(OD)−Sum(OB)−Sum(OC)+Sum(OA)
            return curSum[row2 + 1][col2 + 1] - curSum[row1][col2 + 1] - curSum[row2 + 1][col1] + curSum[row1][col1];
        }
    }

}
