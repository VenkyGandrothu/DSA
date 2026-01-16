package practice.leetcode;

/* Leet code Question Number = 747 */
/* https://leetcode.com/problems/largest-number-at-least-twice-of-others/submissions/1887007813/ */

import java.util.*;

public class LargestNumberAtlestTwice {

	public static void main(String[] args) {
 		
		int nums[] = {3,6,1,0};
		
		//======== Brute Force =========== //
		
		int temp[] = nums.clone();
		
		Arrays.sort(temp);
		
		int large = temp[temp.length-1];
		int seclar = temp[temp.length-2];
		
		if(large < 2*seclar)
		{
			System.out.println("-1");
			System.out.println(large);
		}
		
		for(int i=0; i<nums.length; i++) {
			if(large == nums[i]) {
				System.out.println(i);
			}
		}
		
        //===============___================//
		
		
		//===== Optimize Solution =====
		
		 if (nums.length == 1) {
	          //  return 0;
	            System.out.println("0");
	        }

	        int max = -1;
	        int secondMax = -1;
	        int maxIndex = -1;

	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] > max) {
	                secondMax = max;
	                max = nums[i];
	                maxIndex = i;
	            } else if (nums[i] > secondMax) {
	                secondMax = nums[i];
	            }
	        }

	        if (max >= 2 * secondMax) {
	           // return maxIndex;
	        	 System.out.println(maxIndex);
	        }
	      System.out.println("-1");
	     //   return -1;
		
	}
}
