class Solution {
    public int missingNumber(int[] nums) {
        int i =0;
        int n = nums.length;
        while(i<nums.length){
            if(nums[i]!=i && nums[i]!=n){
                swap(nums,i,nums[i]);
            }
            else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return n;
    }
    static void swap(int[] arr, int i,int f){
        int temp = arr[i];
        arr[i] = arr[f];
        arr[f] = temp;
    }
}
