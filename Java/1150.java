__________________________________________________________________________________________________
class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int c = 0;
        for (int i : nums)
            if (i==target)
                c++;
        return c>nums.length/2;
    }
}
__________________________________________________________________________________________________

__________________________________________________________________________________________________
