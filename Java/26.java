class Solution {
    public static int removeDuplicates(int[] nums) {
    	int len = nums.length;
    	int pos = 1;
    	for(int i=1; i<len; i++) {
    		if(nums[i]!=nums[i-1]) {
    			nums[pos] = nums[i];
    			pos++;
    		}
    	}
    	return pos;
    }
}