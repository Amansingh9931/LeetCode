class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=Integer.MIN_VALUE;
        int n=nums.length;

        int i=0,j=0,z=0;
        while(j<n){
            if(nums[j]==0)z++;
            while(z>k){
                if(nums[i]==0)z--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}