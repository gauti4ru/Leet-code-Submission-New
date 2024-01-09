class SortColor {
    public void sortColors(int[] nums) {
        int zero = 0, ones = 0, two = 0;
        for(int num : nums) {
            if(num / 1 == 1)
                ones++;
            else if(num / 1 == 0)
                zero++;
            else
                two++;
        }
        for(int i = 0; i < nums.length; i++) {
            if(zero != 0) {
                nums[i] = 0;
                zero--;
            } else if(ones != 0) {
                nums[i] = 1;
                ones--;
            } else if(two != 0) {
                nums[i] = 2;
                two--;
            }
        }
    }
}