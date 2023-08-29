class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(presentinarray(nums,original)){
            original = original*2;
        }
        return original;
    }
    public boolean presentinarray(int[] arr,int num){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
}
