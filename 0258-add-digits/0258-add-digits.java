class Solution {
    public int addDigits(int num) {
         int value=0;
        do {
            value = num % 10+value;
            num = num / 10;

        } while( num!= 0);
        num=value;
        num = num / 10 != 0  ? addDigits(value) : num;
        return num;
        
        
    }
}