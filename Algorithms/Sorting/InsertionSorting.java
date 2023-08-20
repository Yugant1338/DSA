 static void insertionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
          // Here the loop runs from 0 to the lenght - 2 iterations.
            for(int j=i+1;j>0;j--){
          // Here the loop runs from i+1 to 1 iteration
                if(arr[j-1]>arr[j]){
          /* It checks for the j and j-1 element everytime with j decrementing
             and if the j-1 element is greater than j element then it is swapped.
             Then if the condition is satisfied the elements are swapped and then the smaller element comes to j-1 index
             For the following iteration that is the comparison of j-2 and j-1 element, 
             then it will again changed as j-2 element is greater than j-1, so obviously j-2 will be greater than j.
          */
                    swap(arr,j-1,j);
                }
                else{
                  /* As we initally with every iteration made sure that the starting elements are sorted 
                     so if anywhere the condition is turning false, so the rest initial array will obviously have no 
                     element that will have this statement true. So breaking it will save time.
                  */
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
