package com.skillstorm;

public class FindMax2D_Array {

	public static void main(String[] args) {
		/*main method has 4 lines with 4 specific functions
		 * 
		 * create an array,
		 * display the array,
		 * display the max,
		 * and display the min.
		 */
		int[][] anArray = Create();
		display(anArray);
		System.out.println("Max value of this array is: " + findMax(anArray));
		System.out.println("Min value of this array is: " + findMin(anArray));
	}
	
	//this method creates a 2-d integer array with [2-11] for each length at random
	//then a random int between 1 and 100 is put into each spot in the array
	//and returns the created array
	public static int[][] Create(){
		int x = (int)(Math.random()*10)+2;
		int y = (int)(Math.random()*10)+2;
		int[][] myArray = new int[x][y];
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				myArray[i][j] = (int)(Math.random()*100)+1;
			}
		}
		return myArray;
	}
	
	//this method takes in a 2-d int array and display it as a matrix
	public static void display(int[][] myArray) {
		for(int i = 0; i < myArray.length; i++) {
			for(int j = 0; j < myArray[i].length; j++) {
				//prints out the value at the point in the array separated by a space
				//without starting a new line in order to maintain the matrix look
				System.out.print(myArray[i][j] + " ");
			}
			//starts a new line for the next array
			System.out.println();
		}
	}
	
	//this method takes in a 2-d int array and returns the highest value within it
	public static int findMax(int[][] myArray) {
		//assigns max to the first value of the first array
		int max = myArray[0][0];
		
		//iterate through the entire 2-d array by moving through all the values
		//in the first array, before moving on the next
		for(int i = 0; i < myArray.length; i++) {
			for(int j = 0; j < myArray[i].length; j++) {
				
				//check if the current value is higher than the current max,
				//then assigns max to the current value in the array if so
				if(max < myArray[i][j]) max = myArray[i][j];
			}
		}
		//after iterating through the entire array, return the new final value of max
		return max;
	}
	
	//this method takes in a 2-d int array and returns the lowest value within it
	//all lines are the same as findMax except for 2 things:
	public static int findMin(int[][] myArray) {
		//changed all "max" variable names to "min"
		int min = myArray[0][0];
		for(int i = 0; i < myArray.length; i++) {
			for(int j = 0; j < myArray[i].length; j++) {
				//flipped the sign on the if() statement
				if(min > myArray[i][j]) min = myArray[i][j];
			}
		}
		return min;
	}
}
