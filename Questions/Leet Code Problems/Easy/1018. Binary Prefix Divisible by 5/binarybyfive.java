class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> answer = new ArrayList<>();
        int remainder = 0;
        
        for (int num : nums) {
            
            remainder = (remainder * 2 + num) % 5;
            
            answer.add(remainder == 0);
        }
        
        return answer; 
    }
}
