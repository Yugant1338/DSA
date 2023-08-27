class Solution {
    public int dominantIndex(int[] nums) {
        int maxindex = findmax(nums);
        int cnt = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[maxindex] >= 2*nums[i] && i!=maxindex){
                cnt++;
            }
        }
        if(cnt == nums.length){
            return maxindex;
        }
        else{
            return -1;
        }
        
    }
    static int findmax(int[] arr){
        int index = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[index]<arr[i]){
                index = i;
            }
        }
        return index;
    }
}
