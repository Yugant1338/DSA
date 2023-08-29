class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int cnt = 2;
        int temp = arr[1] - arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]==temp){
                cnt++;
            }
            else{
                return false;
            }
        }
        if(cnt==arr.length){
            return true;
        }
        else{
            return false;
        }
        
    }
}
