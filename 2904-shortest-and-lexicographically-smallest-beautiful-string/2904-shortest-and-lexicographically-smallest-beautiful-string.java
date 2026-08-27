class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int i=0,j=0,ones=0;
        String ans="";

        while(j<n){
            if(s.charAt(j)=='1')ones++;
            while(ones>k || (i<=j && s.charAt(i)=='0')){
                if(s.charAt(i)=='1')ones--;
                i++;
            }
            if(ones==k){
                String t=s.substring(i,j+1);
                if(ans.isEmpty() || ans.length()>j-i+1 || (t.length()==ans.length() && ans.compareTo(t)>0)){
                    ans=t;
                }
            }
            j++;
        }
        return ans;
        
    }
}