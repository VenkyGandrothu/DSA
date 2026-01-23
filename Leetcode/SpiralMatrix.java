package practice.leetcode;

import java.util.*;

/* Leet code Question Number = Spiral Matrix 54*/
/* https://leetcode.com/problems/spiral-matrix/description/ */

public class SpiralMatrix {

	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = arr.length - 1;
        int left = 0, right = arr[0].length - 1;

        while (top <= bottom && left <= right) {

            // left → right
            for (int j = left; j <= right; j++)
                result.add(arr[top][j]);
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++)
                result.add(arr[i][right]);
            right--;

            // right → left
            if (top <= bottom) {
                for (int j = right; j >= left; j--)
                    result.add(arr[bottom][j]);
                bottom--;
            }

            // bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    result.add(arr[i][left]);
                left++;
            }
        }
        
        System.out.print(result);;

	}

}
