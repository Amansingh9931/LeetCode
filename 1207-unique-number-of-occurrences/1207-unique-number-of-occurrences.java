class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }

        Set<Integer> s=new HashSet<>();
        for(int i:m.values())s.add(i);

        return m.size()==s.size();
    }
}