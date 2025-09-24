import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
    	int majority = nums.length/2;
    	
    	HashMap<Integer, Integer> map = new HashMap<>();
    	
    	for(int numAtual:nums) {
    		if(map.containsKey(numAtual)) {
    			map.put(numAtual, map.get(numAtual)+1);
    		}
    		else {
    			map.put(numAtual, 1);
    		}
    		if(map.get(numAtual)>majority) {
    			return numAtual;
    		}
    	}
    	return -1;
    }
}