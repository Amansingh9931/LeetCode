class Solution {
    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )return true;
        return false;
    }
    public String reverseVowels(String s) {
        int n=s.length();

        char[] c=s.toCharArray();
        int i=0,j=n-1;
        while(i<j){
            while(i<j && !isVowel(c[i]))i++;
            while(i<j && !isVowel(c[j]))j--;
            char t=c[i];
            c[i]=c[j];
            c[j]=t;
            i++;
            j--;
        }
        return new String(c);
    }
}