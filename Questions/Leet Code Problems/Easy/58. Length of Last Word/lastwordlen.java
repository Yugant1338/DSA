class Solution {
    public int lengthOfLastWord(String s){
        int count = 0;
        s = s.trim();
        for (int i = s.length()-1; i >-1 ; i--){
            if(Character.isWhitespace(s.charAt(i))){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
