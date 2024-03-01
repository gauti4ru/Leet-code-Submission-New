class ReversePair {
    //Brute Force Approach
        /*
        public int reversePairs(int[] nums) {
            int reversePairCount=0;
            for(int i=0;i<nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(((float)((float)nums[i]/2))>nums[j]) reversePairCount++;
                }
            }
            return reversePairCount;
        }
    }
    */
    //Divide and Conquer Approach
    /*In this Approach we are using concept of merge sort at the time
    of merging sorted array we are counting the reverse pair ,so that the complexity 
    of solution will decrease.
    */

    public int reversePairs(int[] nums) {
        return divide(nums, 0, nums.length - 1);
    }

    public int divide(int[] nums, int p, int r) {
        int q = (p + r) / 2;
        int count = 0;
        if(p < r) {
            count += divide(nums, p, q);
            count += divide(nums, q + 1, r);
            count += mergeAndCount(nums, p, q, r);
        }
        return count;
    }

    public int mergeAndCount(int[] nums, int p, int q, int r) {
        int[] left = new int[q - p + 2];
        int[] right = new int[r - q + 1];
        int count = 0;
        for(int i = 0; i < left.length - 1; i++) {
            left[i] = nums[p + i];
        }
        for(int i = 0; i < right.length - 1; i++) {
            right[i] = nums[q + 1 + i];
        }
        left[left.length - 1] = Integer.MAX_VALUE;
        right[right.length - 1] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        while(i < left.length - 1 && j < right.length - 1) {
            if((long) left[i] > (long) 2 * right[j]) {
                count = count + left.length - 1 - i;
                j++;
            } else {
                i++;
            }
        }
        i = 0;
        j = 0;
        for(int k = p; k <= r; k++) {
            if(left[i] < right[j]) {
                nums[k] = left[i];
                i = i < left.length - 1 ? ++i : i;
            } else {
                nums[k] = right[j];
                j = j < right.length - 1 ? ++j : j;
            }
        }
        return count;
    }
}