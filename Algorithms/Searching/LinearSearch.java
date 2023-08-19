static int[] linearSearch(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
    	for (int j = i + 1; j < arr.length; j++){
			if (arr[i] > arr[j]) {	
				swap(arr,i,j);
      	 	}
		}
	}
	return arr;
}
static void swap(int[] arr,int a,int b){
	int temp = arr[a];
    arr[a] = arr[b];
	arr[b] = temp;
}
