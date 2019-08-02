package src.com.company;

public class Solution209_MinimumSizeSubarraySum {
    public static void main(String[] args) {

    }
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length==0) return 0;
        if (nums[0]>=s) return 1;
        int l=0,r=l+1;
        int sum = nums[0];
        int length=Integer.MAX_VALUE;
        while(r<nums.length){
            if(nums[r]>=s) return 1;
            sum +=nums[r];
            if (sum>=s){
                while(sum>=s){
                    sum-=nums[l];
                    l++;
                }
                l--;
                length = Integer.min(length,l-r+1);
            }
            r++;
        }
        if (l-r+1==nums.length) return 0;
        return length;
    }
}
