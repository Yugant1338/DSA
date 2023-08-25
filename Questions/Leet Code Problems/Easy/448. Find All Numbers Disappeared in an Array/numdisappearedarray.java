class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int position = nums[i] - 1;
            if (nums[i] != nums[position]){
                int temp = nums[i];
                nums[i] = nums[position];
                nums[position] = temp;
            } 
            else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                answer.add(i+1);
            }
        }
        return answer;
    }
}
