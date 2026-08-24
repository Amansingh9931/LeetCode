class Solution {
    public int characterReplacement(String s, int k) {
        int[] f=new int[26];
        int n=s.length();
        int l=0,r=0,maxLen=0,maxC=0;

        while(r<n){
            f[s.charAt(r)-'A']++;

            maxC=Math.max(maxC,f[s.charAt(r)-'A']);
            if((r-l+1)-maxC>k){
                f[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}