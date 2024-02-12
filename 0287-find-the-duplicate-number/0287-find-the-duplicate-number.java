class Solution {
    /*
    Based on the given description we can say that the given array can be behave as pointers of link list.
    So we can use Floyds cycle detection conpcept
    
    Eg arr=[1,3,4,2,2]
    Index:   0    1    2    3    4
    Value:   1    3    4    2    2
             ↓    ↓    ↑    ↓    ↑
             3    2    4    2   null

    */
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        // Phase 1: Find the intersection point of the two pointers
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        // Phase 2: Find the entrance to the cycle
        slow = 0;
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
 