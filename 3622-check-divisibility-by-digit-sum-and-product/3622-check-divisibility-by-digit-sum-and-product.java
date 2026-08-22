class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int x=n,p=1;
        while(x!=0){
            int rem=x%10;
            s+=rem;
            p*=rem;
            x/=10;
        }
        return n%(s+p)==0;
    }
}