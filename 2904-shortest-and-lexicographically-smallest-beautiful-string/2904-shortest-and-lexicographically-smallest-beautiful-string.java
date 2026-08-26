class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();

        for(int i=k;i<=n;i++){
            String ans="";
            for(int j=0;j<=n-i;j++){
                String t=s.substring(j,j+i);

                int ones=0;
                for(char ch:t.toCharArray())if(ch=='1')ones+=1;

                if(ones==k){
                    if(ans.isEmpty() || t.compareTo(ans) <0){
                        ans=t;
                    }
                }
            }
             if(!ans.isEmpty())return ans;
        }
        return "";
    }
}