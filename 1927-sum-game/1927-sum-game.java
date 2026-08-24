class Solution {
    public boolean sumGame(String num) {
        int n=num.length();

        int leftS=0,rightS=0;
        int leftQ=0, rightQ=0;

        for(int i=0;i<n;i++){
            if(num.charAt(i)=='?'){
                if(i<n/2)leftQ++;
                else rightQ++;
            }else{
                if(i<n/2)leftS+=num.charAt(i)-'0';
                else rightS+=num.charAt(i)-'0';
            }
        }
        int totalQ=leftQ+rightQ;
        if(totalQ%2==1)return true;
        
        int left=2*leftS + 9*leftQ;
        int right=2*rightS + 9*rightQ;
        if(left==right)return false;
        else return true;
    }
}