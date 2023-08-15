static int binarysearch(int[] arr,int start,int end,int key){
        if(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                return binarysearch(arr,start,mid-1,key);
            }
            else{
                return binarysearch(arr,mid+1,end,key);
            }
        }
        else{
            return end;
        }
}
