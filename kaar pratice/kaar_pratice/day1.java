package kaar_pratice;

import java.util.Scanner;

public class day1 {
	
	private static void program1() {
/*
Question 1: Sum of digits until single digit

Problem: Reduce a number to a single digit by repeatedly summing its digits.

Input: 9875
Output: ?
 * */
		
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
		
		int res = findLastDigit(9875);
		System.out.println(res);
		
	}
	
	private static int findLastDigit(int n) {
		int dup = n;
		while(n>=10) {
			n = findSum(n);
		}
		return n;
	}
	
	private static int findSum(int n) {
		int sum = 0;
		while(n > 0){
			int last = n%10;
			sum += last;
			n/=10;
		}
		return sum;
	}
	
	
	private static void program2() {
		// find the second largest element in the array
		int[] arr = {1,2,3,4,5};
		int res = findSLargest(arr);
		System.out.println(res);
	}
	
	
	private static int findSLargest(int[] arr) {
		int largest = arr[0];
		int sL = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > largest) {
				sL = largest;
				largest = arr[i];
			}else if(arr[i] > sL && arr[i] != largest) {
				sL = arr[i];
			}
		}
		return sL;
	}
	
	
	private static void program3() {
		// count vowels in the String
		String s = "kaar technologies";
		
		int res = countVowels(s);
		System.out.println(res);
		
	}
	
	private static int countVowels(String s) {
		int n = s.length();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			char ch = s.charAt(i);
			if(ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u') {
				cnt++;
			}
		}
		return cnt;
	}
	
	private static void program4() {
		// reverse words in the String
		String s = "i am dhinesh kumar";
		String res = reverse(s);
		System.out.println(res);
	}
	
	private static String reverse(String s) {
		String[] str = s.split("\\s+");
		String res= "";
		for(int i=str.length-1;i>=0;i--) {
			res += str[i]+" ";
		}
		return res;
	}
	
	
	private static void program5() {
		// check plaindrome
		int n = 121;
		boolean res = isPalindrome(n);
		System.out.println(res);
	}
	
	private static boolean isPalindrome(int n) {
		int dup = n;
		int rev = 0;
		while(n > 0) {
			int last = n%10;
			rev = rev*10+last;
			n/=10;
		}
		return dup==rev;
	}
	
	public static void main(String[] args) {
		
		program1();
		program2();
		program3();
		program4();
		program5();
	}
}
