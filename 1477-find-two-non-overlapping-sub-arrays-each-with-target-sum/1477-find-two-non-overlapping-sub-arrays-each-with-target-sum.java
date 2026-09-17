class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;

        int[] minLen=new int[n];
        Arrays.fill(minLen,Integer.MAX_VALUE);
        int i=0,j=0, currS=0;
        int bestMinLen = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;

        while(j<n){
            currS+=arr[j];

            while(i<j && currS>target) currS-=arr[i++];

            if(currS==target){
                int len=j-i+1;

                if(i>0 && minLen[i-1]!=Integer.MAX_VALUE){
                    result=Math.min(result,len+minLen[i-1]);
                }
                bestMinLen=Math.min(bestMinLen,len);
            }
            minLen[j]=bestMinLen;
            j++;
        }
        return result==Integer.MAX_VALUE? -1:result;
    }
}