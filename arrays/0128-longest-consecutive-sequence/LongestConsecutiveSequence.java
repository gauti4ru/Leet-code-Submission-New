//First Solution is based on sorting the array and then. finding the consecutive numbers.
import java.util.Arrays;
import java.util.HashSet;
class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int temp = nums.length == 0 ? 0 : 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[i - 1] == 1) temp++;
            else if(nums[i] - nums[i - 1] == 0) continue;
            else {
                count = temp > count ? temp : count;
                temp = 1;
            }
        }
        return temp > count ? temp : count;
    }

    //Best Case Approach with O(n) complexity.
    public static int longestConsecutive01(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        // Create a HashSet to store the elements of the array
        //Creating a HashSet is necessary to use for simplifying the searching algorithm.
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        
        int maxLength = 0;
        // Iterate through the array
        for(int num : nums) {
            // Check if num is the start of a sequence
            if(!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;
                // Increment currentNum and update currentLength while consecutive elements are present
                while(set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                // Update maxLength if the current sequence is longer
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }
}


