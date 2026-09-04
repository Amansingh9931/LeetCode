class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ans=-1;
        int n=nums.length;

        int[] mini=new int[n];
        int m=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<m){
                m=nums[i];
            }
            mini[i]=m;
        }

        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>maxi)maxi=nums[i];
            if(maxi-mini[i]<=k)return i;
        }

        return ans;
    }
}