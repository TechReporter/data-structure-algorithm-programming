
package algoProgrm;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Tanmoy Dasgupta
 */
public class FindMaximumCost {

	public static void main(String[] args) {
		
		int[] arr = {4,3,2,6};
		System.out.println(findMaximumCost(arr));
	}
	
	static int findMaximumCost(int[] arrWeight) {
		
		PriorityQueue<Integer> pList = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -(o1.compareTo(o2));
			}
		});
		for(int i = 0; i<arrWeight.length; i++) 
			pList.add(arrWeight[i]);
		
		
		int maximumCostResult = 0;
		
		while(pList.size() > 1) {
			int fValue = pList.poll();
			int sValue = pList.poll();

			maximumCostResult = maximumCostResult + (fValue +sValue);
			pList.add(fValue +sValue);
		}
		return maximumCostResult;
	}

}
