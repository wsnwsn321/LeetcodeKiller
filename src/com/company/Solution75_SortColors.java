package src.com.company;

public class Solution75_SortColors {
    public static void main(String[] args) {

    }
//    public void sortColors(int[] nums) {
//        int[] count = new int[2];
//        for (int x:nums){
//            count[x]++;
//        }
//        int start=0;
//        for (int x:count){
//            for(int i=start;i<start+x;++i){
//                nums[i] = i;
//            }
//            start+=x;
//        }
//    }
public void sortColors(int[] nums) {
    int p1 = 0, p2 = nums.length - 1, index = 0;
    while (index <= p2) {
        if (nums[index] == 0) {
            nums[index] = nums[p1];
            nums[p1] = 0;
            p1++;
        }
        else if (nums[index] == 2) {
            nums[index] = nums[p2];
            nums[p2] = 2;
            p2--;
            index--;
        }
        index++;
    }
}

}
