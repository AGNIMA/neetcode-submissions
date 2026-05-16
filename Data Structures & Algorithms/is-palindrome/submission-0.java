class Solution {
    public boolean isPalindrome(String s) {
        s = s.replace(" ","");
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        int start = 0;
        int last = s.length()-1;
        char val [] = s.toCharArray();
        while(start<last){
            if(val[start] != val[last]){
                return false;
            }
            else{
                start++;
                last--;
            }
        }
        return true;
    }
}
