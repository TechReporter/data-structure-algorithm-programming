
package algoProgrm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Tanmoy Dasgupta
 */
public class FindMinimalCostOfMeltBall {


	public static void main(String[] args) {
		int[] ballWeight = {4,3,2,6};
		
		System.out.println(findMinimumCost(ballWeight));
	}
	
	static int findMinimumCost(int[] arrWeight) {
		
		PriorityQueue<Integer> pList = new PriorityQueue<>();
		for(int i = 0; i<arrWeight.length; i++) 
			pList.add(arrWeight[i]);
		
		
		int MinimalCostResult = 0;
		
		while(pList.size() > 1) {
			int fValue = pList.poll();
			int sValue = pList.poll();

			MinimalCostResult = MinimalCostResult + (fValue +sValue);
			pList.add(fValue +sValue);
		}
		return MinimalCostResult;
	}

}
