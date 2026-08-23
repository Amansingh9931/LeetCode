class Solution {
    public int totalFruit(int[] arr) {
        int maxLen=0,l=0,r=0,n=arr.length;
        Map<Integer,Integer>m=new HashMap<>();

        while(r<n){
            m.put(arr[r],m.getOrDefault(arr[r],0)+1);
            while(m.size()>2){
                m.put(arr[l],m.getOrDefault(arr[l],0)-1);
                if(m.get(arr[l])==0)m.remove(arr[l]);
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}