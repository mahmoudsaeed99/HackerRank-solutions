
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int i=1;
        int count=0;
        while(i<=n){
            if(n%i==0){
                count+=i;
            }
            i++;
        }
        return count;
    }
    
}
