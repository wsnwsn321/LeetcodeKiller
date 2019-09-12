package com.company;

public class Sorts {
    public static void main(String[] args) {

        int[] arr = new int[]{12, 11, 13, 5, 6,76,44,23};
        //selection_sort(arr);
        //bubble_sort(arr);
        //insertion_sort(arr);
        quickSort(arr,0,7);
        int x =1;
        System.out.println(1);
    }
    public static void selection_sort(int arr[]) {
        for(int i=0;i<arr.length-1;++i){
            int min_index = i;
            for(int j=i+1;j<arr.length;++j){
                if (arr[j]<arr[min_index])
                    min_index =j;
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
    }

    public static void bubble_sort(int arr[]) {
        for(int i=0;i<arr.length-1;++i){
            for(int j=0;j<arr.length-1-i;++j){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void insertion_sort(int arr[]) {
        for (int i=1;i<arr.length;++i){
            while(i-1>=0&&arr[i]<arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1]= temp;
                i--;
            }
        }
    }

    public static void merge_sort(int arr[],int l, int r){
        if(l<r){
            int mid = (r+l)/2;
            merge_sort(arr,l,mid);
            merge_sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }

    }

    public static void merge(int[] arr,int l,int m, int r){
        int arr1[] = new int[m-l+1];
        int arr2[] = new int[r-m];
        for(int i=0;i<m-l+1;++i){
            arr1[i] = arr[l+i];
        }
        for(int j=0;j<r-m;++j){
            arr2[j] = arr[m+1+j];
        }
        int i=0,j=0, k=l;
        while(i<m-l+1&&j<r-m){
            if(arr1[i]<arr2[j])
                arr[k++] = arr1[i++];
            else
                arr[k++] = arr2[j++];
        }
        while(i<m-l+1){
            arr[k++] = arr1[i++];
        }
        while(j<r-m){
            arr[k++] = arr2[j++];
        }
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int p = partition(arr,0,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }

    }

    public static int partition(int[] arr, int low ,int high){
        int pivot = arr[high];
        int s = low;
        for(int i=low;i<high;++i){
            if(arr[i]<pivot){
                int temp = arr[i];
                arr[i] = arr[s];
                arr[s] = temp;
                s++;
            }
        }
        int temp = arr[s];
        arr[s] = pivot;
        arr[high] = temp;
        return s;
    }



}
