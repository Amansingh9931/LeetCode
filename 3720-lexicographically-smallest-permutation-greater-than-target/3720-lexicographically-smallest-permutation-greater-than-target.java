class Solution {
    String ans="";

    public boolean solve(StringBuilder curr,int[] cnt,String target,int i,boolean greater){
        if(i==target.length()){
            if(greater){
                ans=curr.toString();
                return true;
            }
            return false;
        }

        for(char ch='a';ch<='z';ch++){
            if(cnt[ch-'a']==0)continue;
            if(greater==false && ch<target.charAt(i))continue;

            curr.append(ch);
            cnt[ch-'a']--;

            boolean isGreater=greater || ch>target.charAt(i);
            if(solve(curr,cnt,target,i+1,isGreater)){
                return true;
            }
            curr.deleteCharAt(curr.length()-1);
            cnt[ch-'a']++;
        }
        return false;
    } 

    public String lexGreaterPermutation(String s, String target) {
        int[] cnt=new int[26];

        for(char ch:s.toCharArray())cnt[ch-'a']++;

        StringBuilder curr=new StringBuilder();
        solve(curr,cnt,target,0,false);
        return ans;
    }
}