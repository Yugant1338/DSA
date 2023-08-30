class Solution {
    public double average(int[] salary) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i=0;i<salary.length;i++){
            if(max<salary[i]){
                max = salary[i];
            }
            if(min>salary[i]){
                min =  salary[i];
            }
            sum =  sum + salary[i];
        }
        double required = sum - max - min;
        double num = salary.length-2;
        return required/num;
    }
}
