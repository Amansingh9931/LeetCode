class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLen=0;
        int l=0,r=0;
        Map<Character, Integer> lastSeen=new HashMap<>(); 

        while(r<n){
            char c=s.charAt(r);
            if(lastSeen.containsKey(c) && lastSeen.get(c)>=l){
                l=lastSeen.get(c)+1;
            }
            maxLen=Math.max(maxLen,r-l+1);
            lastSeen.put(c,r);
            r++;
        }
        return maxLen;
        
    }
}