package javaPracticePrograms;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
	public static void main(String args[]) {
		int[] nums= {1,2,3,4,4,4,5,5,5,6,8,8,8,8,8,8,8,9,9,9,9,9,9,9};
		int[] temp=new int[nums.length];
		int j=0;
		for(int i=1;i<nums.length;i++) {
		if(nums[i-1]!=nums[i]) {
			temp[j]=nums[i-1];
			j++;
		}
		}
		temp[j]=nums[nums.length-1];
		
		System.out.println(Arrays.toString(temp).replaceAll("0", ""));
		
	}
}
