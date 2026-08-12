class Solution {
    public int maxScore(int[] c, int k) {
        int n=c.length;
        int sum=0;
        for(int i:c)sum+=i;
        int windowSize=n-k, currWindSum=0;

        for(int i=0;i<windowSize;i++){
            currWindSum+=c[i];
        }

        int minWindow=currWindSum;

        for(int i=windowSize;i<n;i++){
            currWindSum+=c[i]-c[i-windowSize];
            minWindow=Math.min(minWindow,currWindSum);
        }
        return sum-minWindow;
    }
}