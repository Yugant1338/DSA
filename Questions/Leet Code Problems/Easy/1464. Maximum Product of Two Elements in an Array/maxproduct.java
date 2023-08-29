class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==2){
            return (nums[0]-1)*(nums[1]-1);
        }
        else{
            Arrays.sort(nums);
            return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        }
    }
}
