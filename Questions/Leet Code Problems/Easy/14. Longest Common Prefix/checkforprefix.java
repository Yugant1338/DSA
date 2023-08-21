class Solution {
    public String longestCommonPrefix(String[] strs){
        int i = 0;
        while(i!=strs.length-1){
            strs[i+1] = checkforprefix(strs[i],strs[i+1]);
            i++;
        }
        return strs[strs.length-1];
    }
    static String checkforprefix(String s1,String s2){
        int count=-1;
        for(int i=0;i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i)==s2.charAt(i)){
                count = i;
            }
            else{
                break;
            }
        }
        String finalprefix;
        if(count!=-1){
            finalprefix = s1.substring(0,count+1); 
        }
        else{
            finalprefix= "";
        }
        
        return finalprefix;
    }
}
