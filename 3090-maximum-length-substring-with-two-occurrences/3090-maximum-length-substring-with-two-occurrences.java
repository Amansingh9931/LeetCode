class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> m=new HashMap<>();
        int l=0,r=0,ans=0;
        while(r<s.length()){
            char rc=s.charAt(r);
            m.put(rc,m.getOrDefault(rc,0)+1);
            while(m.get(rc)>2){
                char lc=s.charAt(l);
                m.put(lc,m.get(lc)-1);
                l++;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}