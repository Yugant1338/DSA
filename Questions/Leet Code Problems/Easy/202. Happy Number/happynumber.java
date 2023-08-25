class Solution {
    public boolean isHappy(int n) {
       while(n!=1){
           n = digitsum(n);
           if(n>1 && n<10 && n!=7){
               return false;
           }
       }
       return true;
    }
    static int digitsum(int num){

        int sum = 0;

        while(num!=0){

            int last = num%10;

            sum =  sum +(int)Math.pow(last,2);

            num = (num-last)/10;

        }

        return sum;

    }
}
