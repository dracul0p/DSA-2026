class Solution {
    public String reverseVowels(String s) {
        int l =0;
        int r = s.length() -1;
        StringBuilder sb = new StringBuilder(s);
        while(l < r){
            char c1 = sb.charAt(l);
            char c2 = sb.charAt(r);

            if( isVowel(c1) && isVowel(c2)){
                sb.setCharAt(l, c2);
                sb.setCharAt(r, c1);
                l++;
                r--;
            }
            else if( isVowel(c1) ){
               r--;
            }else if( isVowel(c2)){
               l++;
            }else{
                 l++;
                r--;
            }
               
        

        }
        return sb.toString();

    }

    public boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch);   // convert to lowercase
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}