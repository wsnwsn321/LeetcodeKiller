package com.company.CompanyList.Amazon;

import com.company.Solution704_BinarySearch;

import java.util.*;

public class AmazonVO {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static void main(String[] args) {
        int x = 6;
        int[][] nums1 = {{0,1,0,1,0},{0,0,0,1,1},{0,0,1,1,0},{0,1,0,1,0},{0,0,1,1,1}};
        int[] nums2 = new int[]{2,5,5,5,6,6,8};
        int[] nums3 = {1, 3, 50, 10, 9, 7, 6};
        String s = "dbanana";
        boolean b = duplicateWords(s);
        //findClosestSquare(x);
        //int r = findSmallestClosest(nums,9);
        //int r =twoSumTwoArray(nums1,nums2,9);
        //int r = findTargetPosition(nums1,5);
        boolean r = pyramidString(s);
        int q = 1;
    }

    //地里 zy1662 题
    public static int findClosestSquare(int num) {
        int sqrt = getSqrt(num);
        return sqrt * sqrt;
    }

    public static int getSqrt(int num) {
        if (num == 0 || num == 1)
            return num;
        int start = 1, end = num, mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid * mid == num) return mid;
            if (mid * mid < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return mid;

    }
    //leetcode 361


    public static int findSmallestClosest(int[] nums, int bar){
            Arrays.sort(nums);
            List<Integer> l = new ArrayList<>();
            for (int x : nums) {
                l.add(x);
            }
            int mid;
            int hi = nums.length - 1, low = 0;
            int r = nums[nums.length - 1];
            while (low <= hi) {
                mid = (hi+low)/2;
                if (nums[mid] == bar) return nums[mid];
                //this is when bar is on the right side, didn't find a value thats higher than bar
                else if (bar>nums[mid]) {
                    low = mid + 1;
                } else {
                    //bar on the left side, nums[mid] larger than bar, update value to it
                    r = Math.min(r, nums[mid]);
                    hi = mid - 1;
                }
            }
            return r;
        }
        public static void printLeaves(TreeNode root){
            if(root==null){
                return;
            }
            printLeaves(root.left);
            if(root.left==null&&root.right==null)
                System.out.println(root);
            printLeaves(root.right);
        }

    public static int twoSumTwoArray(int[] a1, int[] a2,int target){
        Arrays.sort(a1);
        Arrays.sort(a2);
        int i = 0,j=a2.length-1;
        int count=0;
        while(i<a1.length&&j>=0){
            while(i+1<a1.length&&a1[i+1]==a1[i]) i++;
            while(j-1>=0&&a2[j-1]==a2[j]) j--;
            if (a1[i]+a2[j]==target) {
                count++;
                i++;
                j--;
            }
            else if(a1[i]+a2[j]<target){
                i++;
            }
            else{
                j--;
            }
        }

        return count;

    }

    public static List<Integer> rankByFrequency(int[] nums){
        List<Integer> l = new ArrayList<>();
        for(int x: nums){
            l.add(x);
        }
        Map<Integer,Integer> m = new HashMap<>();
        for(int x:l){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> p = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        for(Map.Entry<Integer, Integer> entry: m.entrySet()){
            p.add(entry);
        }
        List<Integer> res = new ArrayList<>();
        int size =p.size();
        for(int i=0;i<size;++i){
            res.add(p.poll().getKey());
        }
        return res;
    }

    public static int findTargetPosition(int[] num, int target){
        int l = 0, r =num.length-1;
        int first = 0,last =0;
        while(l<r){
            int mid = (l+r)/2;
            if (num[mid]==target){
                first = mid;
                last =mid;
                while(first-1>l&&num[first-1]==num[first]) {
                    first--;
                }
                while(last+1>l&&num[last+1]==num[last]) {
                    last++;
                }
                return last-first+1;
            } else if (num[mid] > target) {
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return 0;
    }

    //找出奇数个数的num
    public static List<Integer> findOddNumbers(int[] nums){
        List<Integer> l = new ArrayList<>();
        Map<Integer,Integer> m = new HashMap<>();
        for(int x:nums){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            if(entry.getValue()%2!=0){
                l.add(entry.getKey());
            }
        }
        return l;
    }

    //题目是给一个先递增后递减的数组[1,2,3,4,5,4,3], 查找一个数，返回true和false，问了边界怎么处理，有负数怎么办，有重复的数字怎么办。
//    public static boolean TargetInIncreasingAndDecreasingArray(int[] nums, int target){
//        int max = findMaximum(nums,0,nums.length-1);
//        int n1 = Solution704_BinarySearch.binarySearch(0,max,nums,target);
//        int n2 =Solution704_BinarySearch.binarySearch(max+1,nums.length-1,nums,target);
//        return !(n1==-1 &&n2==-1);
//    }
    //找到先增后减array中的最大数
    public static int findMaximum(int[] nums, int low, int high){
        if(low==high) return nums[low];
        if(low == high-1&&nums[low]< nums[high]) return nums[high];
        if(low == high-1&&nums[low]>= nums[high]) return nums[low];
        int mid =0;
        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid]>nums[mid-1]&&nums[mid]<nums[mid+1])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
    //给一个由0和1组成的matrix，打印出duplicate的row的序列。
    public static List<Integer> findDuplicateRow(int[][] matrix){
        int count=0;
        Set<String> s = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<matrix.length;++i){
            String row = "";
            for(int j=0;j<matrix[i].length;++j){
                row+=String.valueOf(matrix[i][j]);
            }
            if(s.contains(row)) res.add(i);
            else
                s.add(row);
        }
        return res;
    }

    // * Given a string return true/false if it contains any duplicate words
    public static boolean duplicateWords(String s){
        Set<String> res = new HashSet<>();
        int i =0,j=0;
        while(j<s.length()){
            String word = "";
            while(j<s.length()&&s.charAt(j)!=' ') {
                j++;
            }
            word = s.substring(i,j);
            if(res.contains(word)) return true;
            else res.add(word);
            i=j+1;
            j=i+1;
        }
        return false;
    }

    public static boolean pyramidString(String s){
        PriorityQueue<Integer> p = new PriorityQueue<>();
        int[] letters = new int[26];
        char[] cs = s.toCharArray();
        for(char x: cs){
            letters[x-97] +=1;
        }
        for(int x:letters ){
            if(x!=0)
                p.add(x);
        }
        int first = p.poll();
        int size = p.size()-1;
        while(size>=0){
            if(p.peek()-first!=1) return false;
            first = p.poll();
            size--;
        }
        return true;
    }


}

