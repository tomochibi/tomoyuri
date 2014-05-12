package kadai;

import java.util.Scanner;

public class tomoyuri {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int input = sc.nextInt();
		System.out.println(translateEng(input));
	}
	
		static String translateEng(int n) {
			int x=n/10;//10‚ÌˆÊ
			int y=n-(x*10);//1‚ÌˆÊ
			if(n < 10) return countEng1(n);
			if(n>=11 && 19>=n) return countEng3(n);
			if(n%10 == 0) return countEng2(n);
			else if(n>20 && n<100) return countEng2(n)+" "+countEng1(y);
			return n+"";
			
		}
	
	static String countEng1(int n){
		String[] a = new  String[9];
		
		a[0] = "one";
		a[1] = "two";
		a[2] = "three";
		a[3] = "four";
		a[4] = "five";
		a[5] = "six";
		a[6] ="seven";
		a[7] = "eight";
		a[8] = "nine";
		
		
		if(n>=1 && n<=9) {
			return a[n-1];
		}
		
		return "";
	}
	
	static String countEng2(int n){
		
		String[] b = new String[9];
		
		b[0] = "ten";
		b[1] = "twenty";
		b[2] = "thirty";
		b[3] = "forty";
		b[4] = "fifty";
		b[5] = "sixty";
		b[6] = "seventy";
		b[7] = "eighty";
		b[8] = "ninety";
		
	    return b[n/10-1];
		
			
		}
		
	
	static String countEng3(int n){
		String[] c = new  String[9];
		
		
		c[0] = "eleven";
		c[1] = "twelve";
		c[2] = "thirteen";
		c[3] = "fourteen";
		c[4] = "fifteen";
		c[5] = "sixteen";
		c[6] = "seventeen";
		c[7] = "eighteen";
		c[8] = "nineteen";	
	
	return "";
		
	}
}
