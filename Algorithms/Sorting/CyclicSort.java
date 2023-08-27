// Whenever sorting is given from 1 to N or 0 to N number then apply cyclic sorting method
// This algorithm is for sorting number from 1 to N number 
static int[] cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
          /*
            Here if the i index of the array isn't equal to i+1, then the i th element is then swapped to the i-1 index in the array to its correct place
            This is done till we get the correct number on the i th index that is i+1, 
            Once the i+1 number is achieved i is incremented and checked for the i+1 element
          */
            if(arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }
            else{
                i++;
            }
        }
        return arr;
}

// This algorithm is used for sorting from 0 to N numbers
static int[] cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
          /*
            Here if the i index of the array isn't equal to i, then the i th element is then swapped to the i index in the array to its correct place
            This is done till we get the correct number on the i th index that is i, 
            Once the i+1 number is achieved i is incremented and checked for the i+1 element
          */
            if(arr[arr[i]!=i){
                swap(arr,i,arr[i]);
            }
            else{
                i++;
            }
        }
        return arr;
}   


static void swap(int[] arr,int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
