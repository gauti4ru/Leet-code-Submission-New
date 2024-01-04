class SingleNumber {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int num : nums)  result ^= num;
        return result;
            
    }
}
/*
 We are using the concept of XOR Bit wise manipulation
 
 XOR Propetry
 
 A XOR A = 0
 A XOR 1 = A
 A XOR 0 = A
 
 :- A XOR B XOR C XOR = element which is single will be the output
    */