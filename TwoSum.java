package project.test.intw;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		
		int[] nums1 = {3,2,4};
		int target1=6;
		
		int[] nums2 = {3,3};
		int target2 = 6;
		
		TwoSum s = new TwoSum();
		s.twoSum(nums, target);
		s.twoSum(nums1, target1);
		s.twoSum(nums2, target2);
	}

	public int[] twoSum(int[] nums, int target) {
		int[] result= {0,0};
		//System.out.println("__"+Arrays.toString(result));
		//System.out.println(nums.length);
		for (int i = 0; i < nums.length; i++) {
			//System.out.println(i);
			for (int j = i+1; j<nums.length; j++) {
				//System.out.println(j);
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					System.out.println(result[0]);
					System.out.println(result[1]);
					return result;
				} 
			}

		}
		System.out.println(Arrays.toString(result));
		return new int[]{};
	}
}
