package com.skillstorm.recursion;

public class Recursion {
	
	public static int sum(int n) {
		return ((n < 2) ? n : n + sum(n-1));
	}
	
	public static boolean containsLargerThan100(int[] nums) {
		return containsLargerThanN_Helper(nums, 0, 100);
	}
	
	/*
	 * originally had this method named containsLargerThan100Helper, but I
	 * refactored it to work with the second bonus method as well
	 */
	private static boolean containsLargerThanN_Helper(int[] nums, 
													  int index, 
													  int number) {
		if (index >= nums.length) {return false;
		} else if (nums[index] > number) {return true;
		} else {return containsLargerThanN_Helper(nums, index + 1, number);
		}
	}
	
	public static int evenSum(int start, int end) {
		if (start > end) {
			throw new IllegalArgumentException("start cannot be after end");
		} else if (start == end) {return 0;
		} else if (start == end - 1) {return (start%2 == 0) ? start : 0;
		} else {return (start%2 == 0) ? start + evenSum(start + 2, end) : 
									    evenSum(start + 1, end);
		}
	}
	
	public static boolean containsLargerThanN(int[] nums, int n) {
		return containsLargerThanN_Helper(nums, 0, n);
	}
}
