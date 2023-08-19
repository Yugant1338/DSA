class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,result,0,nums1.length);
        System.arraycopy(nums2,0,result,nums1.length,nums2.length);
        Arrays.sort(result);
        int mid = (result.length-1)/2;
        if(result.length%2==0){
            return (double)(result[mid]+result[mid+1])/2;
        }
        else{
            return (double)result[mid];
        }
    }
}
