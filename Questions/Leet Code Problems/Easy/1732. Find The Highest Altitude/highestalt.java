class Solution {
    public int largestAltitude(int[] gain) {
      // A new array is printed with one extra lenght is created
        int[] ans = new int[gain.length+1];
        ans[gain.length] = 0;
        ans[0] = gain[0];
        int max = Math.max(ans[gain.length],ans[0]);
        for(int i=1;i<gain.length;i++){
            ans[i] = ans[i-1]+gain[i];
            if(max<ans[i]){
                max = ans[i];
            }
        }
        return max;
    }
}
