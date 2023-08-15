//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
// LeetCode Problem 34. Find First and Last Position of Element in Sorted Array(Medium)
class Solution{
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==1 && nums[0]==target){
            return new int[]{0,0};
        }
        // if the length of the array is one and that element is equal to the key then simply print {0,0}.
        else if(nums.length!=0){
            return new int[]{initialpos(nums,0,nums.length-1,target),finalpos(nums,0,nums.length-1,target)};
        }
        // if lenght is not equal to one then we must go through the entire procedure of finding the intial and final index.
        else{
            return new int[]{-1,-1};
        }
      // for every other condition {-1,-1} is printed i.e. if element is not present or length is zero.

    }
  
  // Function for finding the lastest index of the target element
    static int initialpos(int[] arr,int start,int end,int key){
        if(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key || arr[mid]>key){
                return initialpos(arr,start,mid-1,key);
            }
            else if(arr[mid]<key){
                return initialpos(arr,mid+1,end,key);
            }
        }
        if(start>end){
            if(start==-1){
                return -1;
            }
            if(start>=arr.length && arr[start-1]!=key){
                return -1;
            }
            else if(arr[start]==key){
                return start;
            }
        }
        return -1;
    }
  // Function for finding the lastest index of the target element
    static int finalpos(int[] arr,int start,int end,int key){
        if(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==key || arr[mid]<key){
                return finalpos(arr,mid+1,end,key);
            }
            else if(arr[mid]>key){
                return finalpos(arr,start,mid-1,key);
            }
        }
        if(start>end){
            if(end==-1){
                return -1;
            }
            else if(arr[end]==key){
                return end;
            }
        }
        return -1;
    }
}
