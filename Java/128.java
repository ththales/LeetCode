class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;

        HashSet<Integer> numSet = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            numSet.add(nums[i]);
        }

        int longest = 1;
        
        for(int num : numSet) {
            if(numSet.contains(num-1)) {
                continue;
            }
            else {
                int currentNum = num;
                int currentSub = 1;
                while(numSet.contains(currentNum+1)) {
                    currentNum++;
                    currentSub++;
                }
                longest = Math.max(longest, currentSub);
            }
        }
        return longest;
    }
}