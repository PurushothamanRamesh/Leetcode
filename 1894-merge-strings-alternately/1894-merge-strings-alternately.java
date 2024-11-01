class Solution {
    public String mergeAlternately(String word1, String word2) {
        String word="";
        int p1=0;
        int p2=0;
        int length=word1.length()+word2.length();
        while(length>0){
            if(p1<word1.length()){
                word+=word1.charAt(p1);
                p1++;
            }
             if(p2<word2.length()){
                word+=word2.charAt(p2);
                p2++;
            }

            length--;
        }
        return word;
}
}