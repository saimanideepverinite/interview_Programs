package daily_updates.thursday;

import java.util.Scanner;


public class Factorial {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int value=1;
		int x=sc.nextInt();
		for(int i=x;i>=1;i--) {
			value=value*i;
		}
		System.out.println(value);
		
	}
}
