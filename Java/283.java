class Solution {
    public void moveZeroes(int[] nums) {
    	int posAtual = 0;
        for(int i=0; i<nums.length; i++) {
        	if(nums[i]!=0) {
        		nums[posAtual] = nums[i];
        		posAtual++;
        	}
        }
        for(int i=posAtual; i<nums.length; i++) {
        	nums[i] = 0;
        }
    }
}