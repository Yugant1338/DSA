class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int product = 1;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                product = product*nums[i];
            }
            else{
                count++;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(count==1){
                if(nums[i]==0){
                    answer[i] = product;
                }
                else{
                    answer[i] = 0;
                }
            }
            if(count>1){
                answer[i] = 0;
            }
            if(count==0){
                answer[i] = product/nums[i];
            }
        }
        return answer;
    }
}
