// SortTools.java 
/*  * EE422C Project 1 submission by  Kevin Brill
 * * Replace <...> with your actual data.  
 * * Kevin Brill 
 * * kjb2786  
 * * 16230  
 * * Spring 2017  
 * * Slip days used: None 
 * */
package assignment1;

public class SortTools {
	/**
	 * * This method tests to see if the given array is sorted. 
	 * * @param x is the array
	 * * @param n is the size of the input to be checked 
	 * * @return true if array is sorted
	 * */
	public static boolean isSorted(int[] x, int n) {
		if(x.length == 0 || n == 0)
		{
			return false;
		}
		
		int temp = x[0];									//temp holds the first element in the array
		
		for(int i = 1; i < n; i++){
			if(x[i] > temp)									//compare temp to the next element in the array
			{
				return false;								//array decreased in value. Return false
			}
			temp = x[i];									//set temp to the next element to continue checking
		}
		
		return true;										//no case of decreasing value found. Return true
	} 
	
	/**
	 * This function looks for the value v in the first n elements of the array and returns the 
	 * index of v if found, returns -1 if not found
	 * @param x is the array
	 * @param n is the number of elements to search through
	 * @param v	is the number to be found
	 * @return the index of v if found, -1 if not found
	 */
	public static int find(int[] x, int n, int v)
	{
		if(isSorted(x,n) == false)
		{
			return 0;										//array isn't in non-decreasing order. Return 0 to avoid catastrophic behavior
		}
		
		
		for(int i = 0; i < n; i++)
		{
			if(x[i] == v)
			{
				return i;									//v found in array, return index
			}
		}
		
		return -1;											//v not found in first n elements. Return -1
	}		
}