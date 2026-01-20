package practice.leetcode;

import java.util.*;

/* Leet code Question Number = 15*/
/* https://leetcode.com/problems/3sum/ */

public class ThreeSum {

	public static void main(String[] args) {
		
		
		int[] arr = { -1, 0, 1, 2, -1, -4};
//==============Brute Force=============================		
		List<List<Integer>> ll = new ArrayList<>();
		Set<List<Integer>> set = new HashSet<>();

		
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					if(arr[i] + arr[j] + arr[k] == 0) {
						 List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
						 Collections.sort(triplet);
						 set.add(triplet);
					}
				}
			}
		}
        ll.addAll(set);
        System.out.println(ll);
        
        
        
//=====================Optimized=================================

 
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);

            int n = nums.length;

            for (int i = 0; i < n - 2; i++) {

                // Skip duplicate values for i
                if (i > 0 && nums[i] == nums[i - 1])
                    continue;

                int left = i + 1;
                int right = n - 1;

                while (left < right) {

                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        left++;
                        right--;

                        // Skip duplicates for left
                        while (left < right && nums[left] == nums[left - 1])
                            left++;

                        // Skip duplicates for right
                        while (left < right && nums[right] == nums[right + 1])
                            right--;

                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            System.out.println(result);
        }
        		
        		
	}

