class Solution {
    public int reverse(int x) {
        
        int reverse = 0;
        
        while(x != 0){ 
            try{
                //Same as reverse = (reverse*10) + x%10
                reverse = Math.addExact(Math.multiplyExact(reverse,10), x%10);
                x = x/10;
            }
            catch(ArithmeticException e){
                return 0;
            }
        }
        
        return reverse;
        
    }
}
