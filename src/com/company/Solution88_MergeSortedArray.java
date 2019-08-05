package com.company;

public class Solution88_MergeSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 11, 13, 5, 6};
        //mergesort(arr,0,4);
        quickSort(arr,0,4);
        int i = arr[1];
    }


    public static void partition(int[] nums, int low, int high){
        int pivot = nums[high];
        int i=low;
        for(int j=low;j<high;++j){
            if(nums[j]<pivot){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }

        }
        int temp = nums[i];
        nums[i] = pivot;
        nums[high] = temp;
    }

    public static void quickSort(int[] nums, int l, int r){
        if(l<r){
            int m = (l+r)/2;
            partition(nums,l,r);
            quickSort(nums,l,m-1);
            quickSort(nums,m+1,r);
        }
    }


//    public static void mergesort(int[]arr, int l,int r){
//        if(l<r){
//            int m = (l+r)/2;
//            mergesort(arr,l,m);
//            mergesort(arr,m+1,r);
//            merge(arr,l,m,r);
//        }
//    }
//
//    public static void merge(int[] arr, int l, int m ,int r){
//        int arr1[] = new int[m-l+1];
//        int arr2[] = new int[r-m];
//        for(int i=0;i<m-l+1;++i){
//            arr1[i] = arr[l+i];
//        }
//        for(int i=0;i<r-m;++i){
//            arr2[i] = arr[m+1+i];
//        }
//        int i=0, j=0, k=l;
//        while(i<arr1.length&&j<arr2.length){
//            if(arr1[i]<arr2[j]){
//                arr[k++] = arr1[i++];
//            }
//            else{
//                arr[k++] = arr2[j++];
//            }
//        }
//        while(i<arr1.length){
//            arr[k++] = arr1[i++];
//        }
//        while(j<arr2.length){
//            arr[k++] = arr2[j++];
//        }
//    }

}
