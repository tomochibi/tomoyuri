package kadai;

import java.util.Scanner;

public class tomoyuri {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int input = sc.nextInt();
		System.out.println(translateEng(input));
	}
	
		static String translateEng(int n) {
			//int z=n/100;
			int x=n/10;//10‚ÌˆÊ
			int y=n-(x*10);//1‚ÌˆÊ
			
			if(n <= 10) return countEng1(n);
			
			if(n>=11 && 19>=n) return countEng3(n);
			
			if(n%10 == 0) return countEng2(n);
			else if(n>20 && n<=109) return countEng2(n)+" "+countEng1(y);
			else if(n>=111 && 119>=n) return countEng2(n)+" "+countEng3(n);
			
			return n+"";
			
		}
	
	static String countEng1(int n){
   String[] a = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
		 
		
		if(n>=0 && n<=10) {
			return a[n];
		}
		
		return "";
	}
	
	static String countEng2(int n){
		
		String[] b = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred"};
		
		
		if(n>20 && n<=109) return b[n/10-2];
		
		else return b[n/10-3];
		}
		
			
		
		
	
	static String countEng3(int n){
		
		String[] c = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		
		
		return c[n%10-1];
	
	
		
	}
}
