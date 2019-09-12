//package com.company.goldmansachs;
//
//import java.util.Arrays;
//import java.util.List;
//public class RotateString{
//    public static String rotate(char[] arr, List<Integer> shift, List<Integer> dir){
//
//     int total = 0;
//        for(int i = 0; i< shift.size(); i++){
// 
//            if(dir.get(i) == 1){
//                total += shift.get(i);
//            }else{
//                total -= shift.get(i);
// 
//            }
//        }
// 
////         total %= arr.length;
//        total = total & arr.length
//         
//        total = total>0? total: arr.length+total;
//         
//        reverse(arr, 0, arr.length - 1);
//        reverse(arr, 0, total-1);
//        reverse(arr, total, arr.length-1);
// 
//        String res = "";
//         
//        for(char c: arr){
//            res += c;
//        }
//         
//        return res;
//    }
// 
//            private static void reverse(char[] arr, int start, int end){
// 
//        while(start<end){
// 
//            char temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
// 
//            start++;
//            end--;
//        }
//    }
//    public static void main(String[] args){
// 
//        char[] arr = "abcde".toCharArray();
// 
//        List<Integer> shift = Arrays.asList(1,2,3,5);
//        List<Integer> dir = Arrays.asList(1,0,1,1);
// 
// 
//        String res = rotate(arr, shift, dir);
// 
//        System.out.println(res);
// 
//    }
//}