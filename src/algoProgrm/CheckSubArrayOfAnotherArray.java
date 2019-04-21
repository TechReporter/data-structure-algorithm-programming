/**
 * 
 */
package algoProgrm;

/**
 * @author Tanmoy Dasgupta
 */
public class CheckSubArrayOfAnotherArray {

	public static void main(String[] args) {
		int[] array1 = {2, 3, 0, 5, 1, 3, 0,2};
		int[] array2 = {3, 0, 5, 1};

		System.out.println(checkSubArray(array1,array2));
		System.out.println(isSubArray(array1,array2, array1.length,array2.length));
	}
	//Solution 1
	static boolean checkSubArray(int[] array1, int[] array2) {
		for(int i=0; i<array1.length; i++) {
			int pointer1=0;
			if(array1[i]==array2[0]) {
				int pointer2=1;
				pointer1+=i+1;
				if(pointer1<=array1.length) {
					for(int j=1;j<array2.length;j++) {
						if(array1[pointer1]==array2[j]) {
							pointer1++;
							pointer2++;
							if(pointer2==array2.length)
								return true;
						}else {
							break;
						}
					}
				}

			}
		}
		return false;
	}

	//Solution 2
	static boolean isSubArray(int A[], int B[], int n, int m) 
	{ 
		int i = 0, j = 0; 
		while (i < n && j < m) { 

			if (A[i] == B[j]) { 
				i++; 
				j++; 

				if (j == m) 
					return true; 
			}
			else { 
				i++; 
				j = 0; 
			} 
		} 
		return false; 
	} 

}
