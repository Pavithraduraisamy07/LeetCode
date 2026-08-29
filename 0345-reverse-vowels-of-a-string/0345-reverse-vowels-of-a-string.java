class Solution {
    public String reverseVowels(String s) {
        int start=0;
        int end=s.length()-1;
        String vowels="aeiouAEIOU";
        char c[]=s.toCharArray();
        while(start<end){
             while (start < end && !vowels.contains(c[start] + "")) {
                start++;
            }
              while (start < end && !vowels.contains(c[end] + "")){
                end--;
            }
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;
        }
        return new String(c);
    }
}