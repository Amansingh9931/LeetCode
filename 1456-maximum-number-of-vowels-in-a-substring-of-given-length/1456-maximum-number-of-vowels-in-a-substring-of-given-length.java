class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length(), ans=0,c=0;
        String v="aeiou";
        for(int i=0;i<n;i++){
            if(v.contains(s.charAt(i)+""))c++;
            if(i>=k && v.contains(s.charAt(i-k)+""))c--;
            ans=Math.max(ans,c);
        }
        return ans;
    }
}