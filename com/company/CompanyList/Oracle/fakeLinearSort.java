package com.company.CompanyList.Oracle;

import java.util.ArrayList;
import java.util.List;

public class fakeLinearSort {
    public static void main(String[] args) {

    }
    public List<Integer> sort(int[] nums){
        int max=Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        //算出最大值 最小值
        for (int x:nums){
            min = Math.min(min,x);
            max = Math.max(max,x);
        }
        //count 的范围就是max-min，因为所有数都会出现在这个范围里
        int[] count = new int[max-min+1];
        //count存的是array里任意一个值出现的次数
        for (int x:nums){
            count[x-min] +=1;
        }
        List<Integer> res = new ArrayList<>();
        for (int i=0;i<count.length;++i){
            //当count[i]>0, 把里面的数加进res list
            while (count[i]>0)
                res.add(min+i);
        }
        return res;
    }
}
