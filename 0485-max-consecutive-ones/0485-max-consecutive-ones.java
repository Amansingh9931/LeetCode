class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen=0,curr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)curr++;
            else curr=0;
            maxLen=Math.max(maxLen,curr);
        }
        return maxLen;
    }
}