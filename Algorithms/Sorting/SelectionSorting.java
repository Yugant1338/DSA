// This is for creating an ascending order sorting
static int[] selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length - i -1; 
          /* Here this is used as the last to limit the array to check for the largest element in the already sorted end, 
             as it will return the max value their
          */
            int maxindex = maxnum(arr,0,last);
          /* Here then the index of the maximum element is found and stored.
             Note: That the maximum is only being tried to find the desired part of the array.
          */
            swap(arr,maxindex,last); // Swapping of the maximun element is done to the last of the array
         }
        return arr;
    }
    static int maxnum(int[] arr,int start,int end){
        int max = start;
        for (int i = start+1; i <= end; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

// Algorithm for sorting the element in desecding order
static int[] selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int start = i;
          /* Here this(start) is used as to limit the array to check for the largest element in the already sorted starting, 
             as it will return the max value their
          */
            int maxindex = max(arr,start,arr.length-1);
            swap(arr,maxindex,start);
        }
        return arr;
    }

    static int max(int[] arr, int start, int end){
        int maxindex = start;
        for(int i =start+1;i<=end;i++){
            if(arr[maxindex]<arr[i]){
                maxindex=i;
            }
        }
        return maxindex;
    }
    static void swap(int[] arr,int minindex,int start){
        int temp = arr[minindex];
        arr[minindex] = arr[start];
        arr[start] = temp;
    }
