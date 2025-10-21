public class Solution {
	public static void rotate(int[] nums, int k) {
		k = k%nums.length;

		for(int i=0, j=nums.length-1; i<j; i++, j--) {
			int aux = nums[i];
			nums[i] = nums[j];
			nums[j] = aux;
		}
		
		for(int i=0, j=k-1; i<j; i++, j--) {
			int aux = nums[i];
			nums[i] = nums[j];
			nums[j] = aux;
		}
		
		for(int i=k, j=nums.length-1; i<j; i++, j--) {
			int aux = nums[i];
			nums[i] = nums[j];
			nums[j] = aux;
		}
    }
}