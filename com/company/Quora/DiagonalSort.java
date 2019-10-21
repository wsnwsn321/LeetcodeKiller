package com.company.Quora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DiagonalSort {
    public static void main(String[] args) {
        int M[][] = {
                {3,5,1},
                {10,6,2},
                {9,7,4},
        };
        diagonalOrder(M);
    }
    static void diagonalOrder(int matrix[][]) {
        int m = matrix.length;
        int n = matrix[0].length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //top-right corner
        for (int i=0;i<m;++i) {
            for (int j=0;i+j<n;++j){
                pq.add(matrix[j][i+j]);
            }
            for (int j=0;i+j<n;++j){
                matrix[j][i+j] = pq.poll();
            }
        }
        //bottom-left corner
        for (int i=1;i<m;++i) {
            for (int j=0;i+j<n;++j){
                pq.add(matrix[i+j][j]);
            }
            for (int j=0;i+j<n;++j){
                matrix[i+j][j] = pq.poll();
            }
        }
        //output result
        for (int i=0;i<m;++i){
            for (int j=0;j<n;++j){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
