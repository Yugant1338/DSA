class Solution {
    public int arrangeCoins(int n){
        return bs(1,n,n);
    }
    static int bs(int start,int end,int key){
        if(start<=end){
            long mid = start+(end-start)/2;
            long coinstillnow = (mid*(mid+1))/2;
            if(coinstillnow==key){
                return (int) mid;
            }
            else if(coinstillnow>key){
                return bs(start,(int)mid-1,key);
            }
            else{
                return bs((int)mid+1,end,key);
            }
        }
        return (int)end;
    }
}
