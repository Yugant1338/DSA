class Solution {
    public int[] sumZero(int n) {
    int[] arr = new int[n];
    if(n%2==0){
        for(int i=0;i<n/2;i++){
           arr[i] = i+1;
        }
        int temp=n/2;
        for(int i=0;i<n/2;i++){
           arr[temp] = (i+1)*-1;
           temp++;
        }
    }
    else{
        for(int i=0;i<n/2;i++){
            arr[i] = i+1;
        }
        arr[n/2] = 0;
        int temp = n/2 + 1;
        for(int i=0;i<n/2;i++){
            arr[temp] = (i+1)*-1;
            temp++;
            
        }
    }
    return arr;
    }
}
