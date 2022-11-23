package com.skillstorm;

public class Arrays {

	public static void main(String[] args) {
		
		int[] intNumbers = {1, 4, 6, 4, 15, -2, 5};
		int maxInt = findMax(intNumbers);
		int minInt = findMin(intNumbers);
		
		double[] doubleNumbers = {4.0, 6.9, 0.01, -13.6};
		double maxDouble = findMax(doubleNumbers);
		double minDouble = findMin(doubleNumbers);
		
		float[] floatNumbers = {16.66f, 11.111f, 5f};
		float maxFloat = findMax(floatNumbers);
		float minFloat = findMin(floatNumbers);
		
		byte[] byteNumbers = {5, 2, 1, 0, -3, -14, 5, 13, 22};
		byte maxByte = findMax(byteNumbers);
		byte minByte = findMin(byteNumbers);
		
		System.out.println("The max values from the given arrays are:");
		System.out.println(maxInt);
		System.out.println(maxDouble);
		System.out.println(maxFloat);
		System.out.println(maxByte);
		
		System.out.println();
		
		System.out.println("The minimum values from the given arrays are:");
		System.out.println(minInt);
		System.out.println(minDouble);
		System.out.println(minFloat);
		System.out.println(minByte);
	}
	
	//these four methods will use the new for each loop
	public static int findMax(int[] numbers) {
		int max = numbers[0];
		for(int number : numbers) {
			if(number > max)
				max = number;
		}
		return max;
	}
	
	public static double findMax(double[] numbers) {
		double max = numbers[0];
		for(double number : numbers) {
			if(number > max)
				max = number;
		}
		return max;
	}
	
	public static float findMax(float[] numbers) {
		float max = numbers[0];
		for(float number : numbers) {
			if(number > max)
				max = number;
		}
		return max;
	}
	
	public static byte findMax(byte[] numbers) {
		byte max = numbers[0];
		for(byte number : numbers) {
			if(number > max)
				max = number;
		}
		return max;
	}

	//these four methods will use the legacy for each loop, 
	//which is also able to be 1 iteration more efficient for this example
	public static int findMin(int[] numbers) {
		int min = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] < min)
				min = numbers[i];
		}
		return min;
	}
	
	public static double findMin(double[] numbers) {
		double min = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] < min)
				min = numbers[i];
		}
		return min;
	}
	
	public static float findMin(float[] numbers) {
		float min = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] < min)
				min = numbers[i];
		}
		return min;
	}
	
	public static byte findMin(byte[] numbers) {
		byte min = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] < min)
				min = numbers[i];
		}
		return min;
	}

}
