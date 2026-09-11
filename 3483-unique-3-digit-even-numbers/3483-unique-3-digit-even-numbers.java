class Solution {
    public int totalNumbers(int[] d) {
        Set<Integer>s=new HashSet<>();
        int n=d.length;

        for(int i=0;i<n;i++){
            if(d[i]==0)continue;
            for(int j=0;j<n;j++){
                if(j==i)continue;
                for(int k=0;k<n;k++){
                    if(i==k || j==k)continue;
                    if(d[k]%2!=0)continue;
                    int c=d[i]*100+ d[j]*10+d[k];
                    s.add(c);
                }
            }
        }
        return s.size();
    }
}