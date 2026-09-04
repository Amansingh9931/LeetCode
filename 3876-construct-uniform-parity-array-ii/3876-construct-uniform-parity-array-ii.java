class Solution {
    public boolean uniformArray(int[] nums1) {
        int mini=Integer.MAX_VALUE;
        int c=0;
        for(int i:nums1){
            mini=Math.min(i,mini);
            if(i%2==1)c++;
        }
        return mini%2==1 || c==0;
    }
}