class Solution {
    public int heightChecker(int[] heights) {
        int cnt = 0;
        int[] old = Arrays.copyOfRange(heights,0,heights.length);
        Arrays.sort(heights);
        for(int i=0;i<old.length;i++){
            if(old[i]!=heights[i]){
                cnt++;
            }
        }
        return cnt;
    }
}
