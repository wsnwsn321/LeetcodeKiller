package src.com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution525_ContiguousArray {
    public static void main(String[] args) {

    }
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        int sum=0;
        int ans = 0;
        for(int i =0;i<nums.length;++i){
            sum+=nums[i]==1?1:-1;
            if(sum==0) ans = Math.max(i+1,ans);
            else if(m.containsKey(sum)){
                ans = Math.max(i-m.get(sum),ans);
            }
            else{
                m.put(sum,i);
            }
        }
        return ans;
    }
}
