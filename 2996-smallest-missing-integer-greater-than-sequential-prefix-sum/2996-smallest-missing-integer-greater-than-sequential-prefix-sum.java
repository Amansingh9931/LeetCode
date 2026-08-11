class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int seqSum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1)seqSum+=nums[i];
            else break;
        }

        while(true){
            boolean flag=false;

            for(int i:nums){
                if(i==seqSum){
                    flag=true;
                    break;
                }
            }
            if(!flag)return seqSum;
            seqSum++;
        }
    }
}