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
			if(n < 20) return countEng1(n);
			if(n%10 == 0) return countEng2(n);
			return n+"";
			
		}
	
	static String countEng1(int n){
		String[] a = new  String[19];
		
		a[0] = "one";
		a[1] = "two";
		a[2] = "three";
		a[3] = "four";
		a[4] = "five";
		a[5] = "six";
		a[6] ="seven";
		a[7] = "eight";
		a[8] = "nine";
		a[9] = "ten";
		a[10] = "eleven";
		a[11] = "twelve";
		a[12] = "thirteen";
		a[13] = "fourteen";
		a[14] = "fifteen";
		a[15] = "sixteen";
		a[16] = "seventeen";
		a[17] = "eighteen";
		a[18] = "nineteen";
		
		
		if(n>=1 && n<=19) {
			return a[n-1];
		}
		
		return "";
	}
	
	static String countEng2(int n){
		int x,y;
		String[] b = new String[8];
		
		
		b[0] = "twenty";
		b[1] = "thirty";
		b[2] = "forty";
		b[3] = "fifty";
		b[4] = "sixty";
		b[5] = "seventy";
		b[6] = "eighty";
		b[7] = "ninety";
		
		if(n%10 == 0) {
			return b[n/10-1];
			
		}
		return "";
		
	}
	
	//static String count
}