package com.company.CompanyList.mapbox;

import java.util.*;

public class evenOddOperation {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        operation(a);
    }
    static int res=0;
    static Map<String,Integer> memo = new HashMap<>();
    public static int operation(int[] array){
        if (array.length==1) return array[0];
        int[] cur_sum = new int[array.length];
        cur_sum[0] = array[0];
        for (int i=1;i<cur_sum.length;++i){
            cur_sum[i] = cur_sum[i-1]+array[i];
        }
        int r = dfs(array,0,array.length-1,cur_sum,0,1);
        return r;

    }
    public static int dfs(int[] array, int l, int r,int[]cur_sum, int sum, int step){
        if (l>r){
            return sum;
        }
        char op = step%2!=0?'+':'-';
        String index = l+","+r+","+op;
        if (memo.containsKey(index)){
            return memo.get(index);
        }

        if (step%2!=0){
            sum+=cur_sum[r]-cur_sum[l]+array[l];
        }
        else {
            sum-=cur_sum[r]-cur_sum[l]+array[l];
        }
        int ml = dfs(array,l+1,r,cur_sum,sum,step+1);
        int mr = dfs(array,l,r-1,cur_sum,sum,step+1);
        sum = Math.max(ml,mr);
        memo.put(index,sum);
        return sum;



    }
}
