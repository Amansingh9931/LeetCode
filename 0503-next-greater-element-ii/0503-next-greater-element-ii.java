class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--)s.push(nums[i]);

        int j=n-1;
        for(int i=n-1;i>=0;i--){
            int x=nums[i];
            while(!s.isEmpty() && s.peek()<=nums[i]){
                s.pop();
            }
            ans[i]=s.isEmpty()?-1:s.peek();
            s.push(x);
        }
        return ans;
    }
}