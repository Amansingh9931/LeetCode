class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length,i=0,j=0,ans=0;
        int z=0;
        while(i<n){
            if(nums[i]==0)z++;
            while(z>k){
                if(nums[j]==0)z--;
                j++;
            }
            ans=Math.max(ans,i-j+1);
            i++;
        }
        return ans;
    }
}