package practice.leetcode;

/* Leet code Question Number = 292 */
/* https://leetcode.com/problems/nim-game/description/ */



public class Nimgame {
	
	public static void main(String[] args) {
		
		int n = 4; 
		
		int rem = n % 2;
		int div = n / 2;
		
		if(rem == 1 && div % 2 == 0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}
	

}
