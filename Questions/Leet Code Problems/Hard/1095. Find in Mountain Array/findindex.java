class Solution {
    public int max(MountainArray arr){
        int start = 0 ; 
        int end = arr.length() - 1;
        while(start < end){
            int med = start + (end - start) / 2;
            if(arr.get(med) > arr.get(med + 1)){
                // decreasing part of the array.
                end = med;
            }else if(arr.get(med) < arr.get(med + 1)){
                //increasing part of the array
                start = med + 1;
            }
        }
        return start;
    }
    public int BS(MountainArray arr, int element, int start , int end){
        boolean o = arr.get(start) < arr.get(end);
        while(start <= end){
            int med = start + (end - start) / 2;
            if(element == arr.get(med)){
                return med;
            }
            if(o){
                if(element > arr.get(med)){
                    start = med + 1;
                }else{
                    end = med - 1;
                }
            }else{
                if(element < arr.get(med)){
                    start = med + 1;
                }else{
                    end = med - 1;
                }
            }
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray nums) {
        int max = max(nums);
        int ans = BS(nums , target , 0 , max);
        if(ans != -1){
            return ans;
        }
        return BS(nums , target , max + 1 , nums.length() - 1);
    }
}
