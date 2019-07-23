package src.com.company;

public class Solution219_ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int ind=-1;
        for (int i=0;i<nums.length;++i){
            if (nums[i]==k) {
                if (ind!=-1) ind =i;
                else if(i-ind<=k) return true;
                else ind = i;
            }
        }
        return false;
    }
}
