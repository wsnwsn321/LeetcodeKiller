package com.company.CompanyList.Oracle;

public class FindFirstNumGreaterThanKSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 8, 12};
        int ans = find(arr,12);
        int x = 3;
    }
    public static int find(int[] nums, int target){
        int l=0,r = nums.length-1;
        int ans = nums[0]-1;
        while (l<=r){
            int mid = l+(r-l)/2;
            if (nums[mid]<=target){
                l = mid+1;
            }
            else {
                ans = mid;
                r = mid-1;
            }
        }
        return ans==nums[0]-1?-1:ans;
    }
}
