package kadai;

import java.util.Scanner;

public class tomoyuri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int input = sc.nextInt();
		System.out.println(translateEng(input));
	}
		static String translateEng(int n) {
			if(n < 10) return countEng1(n);
			return n+"";
			
		}
	
	static String countEng1(int n){
		if(n == 1) return "one";
		if(n == 2) return "two";
		if(n == 3) return "three";
		if(n == 4) return "four";
		if(n == 5) return "five";
		if(n == 6) return "six";
		if(n == 7) return "seven";
		if(n == 8) return "eight";
		if(n == 9) return "nine";
		return "";
	}
}