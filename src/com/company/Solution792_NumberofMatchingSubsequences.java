package src.com.company;

public class Solution792_NumberofMatchingSubsequences {
    public static void main(String[] args) {
        String s = "abcde";
        
    }
    public int numMatchingSubseq(String S, String[] words) {
        int count=0;
        int[] firstIndex = new int[26];
        java.util.Arrays.fill(firstIndex,-1);
        int[] lastIndex = new int[26];
        for(int i=0;i<S.length();++i){
            if(firstIndex[S.charAt(i)-'a']==-1)
                firstIndex[S.charAt(i) - 'a'] = i;
            lastIndex[S.charAt(i) - 'a'] = i;
        }
        boolean isWord =true;
        for(String w:words){
            for(int i=0;i<w.length();++i){
                if(firstIndex[S.charAt(i)-'a']>=lastIndex[S.charAt(i+1) - 'a']) {
                    isWord = false;
                    break;
                }

            }
            if(isWord) count++;
            isWord = true;
        }
        return count;
    }
}