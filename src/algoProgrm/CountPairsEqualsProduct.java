/**
 * 
 */
package algoProgrm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tanmoy Dasgupta
 */
public class CountPairsEqualsProduct {


	public static void main(String[] args) {

		int[] array = {2,5,3,6,30,11,10};
		System.out.println("pair count :: "+countPairs(array));
	}
	
	static int countPairs(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			map.put(i, arr[i]);
		}
		for(int j = 0;j<arr.length;j++) {
			for(int k=j;k<arr.length;k++) {
				if(map.containsValue(arr[j]*arr[k]))
					count++;
			}
		}
		return count;
	}
	
	

}
