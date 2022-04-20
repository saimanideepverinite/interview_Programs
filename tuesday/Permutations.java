package daily_updates.tuesday;

import java.util.Scanner;
public class Permutations {
	static void combinations(String str, String ans)
	{		if (str.length() == 0) {
			System.out.print(ans + " ");
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) +str.substring(i + 1);
			combinations(ros, ans + ch);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("enter the string");

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		combinations(s, "");
	}
}
