//package com.company;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution723_CandyCrush {
//    public static void main(String[] args) {
//
//    }
//    public int[][] candyCrush(int[][] board) {
//        boolean found =true;
//        while (found){
//            found = false;
//            for (int i=0;i<board.length;++i) {
//                for (int j = 0; j < board[0].length; ++j) {
//                    //row is crushable
//                    if (j<board[0].length-2&&board[i][j]==board[i][j+1]&&board[i][j+1]==board[i][j+2]){
//                        int cur = j+1;
//                        while (j+1<board[0].length&&board[i][j]==board[i][j+1]){
//                            board[i][j]=-board[i][j];
//                            board[i][j+1]=-board[i][j];
//                            j++;
//                        }
//                    }
//
//                }
//            }
//            }
//        }
//
//
//}
