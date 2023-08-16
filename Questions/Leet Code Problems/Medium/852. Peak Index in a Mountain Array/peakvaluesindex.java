//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return bsofpeak(arr,0,arr.length-1);
    }
    static int bsofpeak(int[] arr,int start,int end){       
        if(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1]){
                return bsofpeak(arr,mid+1,end);
            }
            /* 
               Here if our mid element is smaller than the following element that means, the array is still increasing. 
               So we have to then continue searching for the largest element in the following array from the mid+1 to end scope.
            */
            else if(arr[mid]>arr[mid+1]){
                return bsofpeak(arr,start,mid-1);
            }
            /* 
               Here if our mid element is greater than the following element that means, the array has reached it's peak and we may have left the largest element behind. 
               So we have to then continue searching for the largest element in the backward array from the start to mid-1 scope.
            */
            else{
                return -1;
            }
        }
          /* 
              Once the recursion is carried at a certain point only one element will be left, and it would be the neighbour(just one index back) to the largest element,
              Then the start<=end conditon will become false and the start will contain the largest element.
          
          */
        else{
            return start;
        }
    }
}
