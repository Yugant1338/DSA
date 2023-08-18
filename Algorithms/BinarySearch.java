   static int binarysearchagnostic(int[] arr,int start,int end,int key){
      boolean checkasc = arr[start] < arr[end];
       if(checkasc){
          if(start<end){
           int mid = start + (end-start)/2;
           if(arr[mid]==key){
               return mid;
           }
           else if(arr[mid]>key){
               return binarysearchagnostic(arr,start,mid-1,key);
           }
           else{
               return binarysearchagnostic(arr,mid+1,end,key);
           }
         }
          return -1;
       }
      else{
         if(start<end){
           int mid = start + (end-start)/2;
           if(arr[mid]==key){
               return mid;
           }
           else if(arr[mid]<key){
               return binarysearchagnostic(arr,start,mid-1,key);
           }
           else{
               return binarysearchagnostic(arr,mid+1,end,key);
           }
          }
          return -1;
      }
   }
