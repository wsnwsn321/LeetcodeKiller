package src.com.company;

public class Solution792_NumberofMatchingSubsequences {
    public static void main(String[] args) {
        String s = "ricogwqznwxxcpueelcobbbku" +
                "vxxrvgyehsudccpsnuxpcqobtvwkuvsubiidjtccoqvuahijyefbpqhbejuisks" +
                "utsowhufsygtwteiqyligsnbqglqblhpdzzeurtdohdcbjvzgjwylmmoiundjscnlhbr" +
                "hookmioxqighkxfugpeekgtdofwzemelpyjsdeeppapjoliqlhbrbghqjezzaxuwyrbczo" +
                "dtrhsvnaxhcjiyiphbglyolnswlvtlbmkrsurrcsgdzutwgjofowhryrubnxkahocqjzwwag" +
                "qidjhwbunvlchojtbvnzdzqpvrazfcxtvhkruvuturdicnucvndigovkzrqiyastqpmfmuou" +
                "ycodvsyjajekhvyjyrydhxkdhffyytldcdlxqbaszbuxsacqwqnhrewhagldzhryzdmmr" +
                "wnxhaqfezeeabuacyswollycgiowuuudrgzmwnxaezuqlsfvchjfloczlwbefksxsbanrektvi" +
                "bbwxnokzkhndmdhweyeycamjeplecewpnpbshhidnzwopdjuwbecarkgapyjfgmanuavzrxr" +
                "icbgagblomyseyvoeurekqjyljosvbneofjzxtaizjypbcxnbfeibrfjwyjqrisuybfxpvqy" +
                "wqjdlyznmojdhbeomyjqptltpugzceyzenflfnhrptuugyfsghluythksqhmxlmggtcbdddeo" +
                "incygycdpehteiugqbptyqbvokpwovbnplshnzafunqglnpjvwddvdlmjjyzmwwxzjckmapti" +
                "lrbfpjxiarmwalhbdjiwbaknvcqovwcqiekzfskpbhgxpyomekqvzpqyirelpadooxjhsyxjk" +
                "fqavbaoqqvvknqryhotjritrkvdveyapjfsfzenfpuazdrfdofhudqbfnzxnvpluwicurrtsh" +
                "yvevkriudayyysepzqfgqwhgobwyhxltligahroyshfndydvffd";
        String[] words = new String[]{"ylmmo","bb","acd","ade"};
        numMatchingSubseq(s,words);


    }
    public static int numMatchingSubseq(String S, String[] words) {
        int count=0;
        boolean isWord =true;
        for(String w:words){
            if(w.length()==1){
                if(S.indexOf(w.charAt(0))>-1)
                    count++;
                continue;
            }
            int s =0,fp=0,sp=0;
            for(int i=0;i<w.length()-1;++i){
                fp = S.indexOf(w.charAt(i),s);
                sp = S.indexOf(w.charAt(i+1),fp);
                if(sp<=fp){
                    isWord =false;
                    break;
                }
                s = fp;
            }
            if(isWord) count++;
            isWord = true;
        }
        return count;
    }
}