package kadai;

import java.util.Scanner;

public class tomoyuri {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int input = sc.nextInt();
		System.out.println(translateEng(input));
	}
	
		static String translateEng(int n) {
			int x=n/10;//10�̈�
			int y=n-(x*10);//1�̈�
			if(n <= 10) return countEng1(n);
			if(n>=11 && 19>=n) return countEng3(n);
			
			if(n%10 == 0) return countEng2(n);
			else if(n>20 && n<=101) return countEng2(n)+" "+countEng1(y);
			else if(n>=111 && 119>=n) return countEng2(n)+" "+countEng3(y);
			
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
		
		
		
	    return b[n/10-2];
		
			
		}
		
	
	static String countEng3(int n){
		int x=n/10;//10�̈�
		int y=n-(x*10);//1�̈�
		String[] c = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		
		
		return c[y-1];
	
	
		
	}
}
