package daily_updates.tuesday;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ascii {
	private static int count=0;

	public static void main(String args[]) {
	Map<Character,Integer> map = new HashMap<>();
	String s="SAI MANIDEEP";
	char[]x=s.toCharArray();
	for(char y:x) 
	{
		if(!map.containsKey(y)) 
		{
			count=1;
			map.put(y,count);
		}
		else {
			count=count+1;
			map.put(y,count);
		}
	
	}
	System.out.println("testing");
	for (Map.Entry<Character, Integer> c : map.entrySet()) {
		System.out.println(c.getKey()+" "+c.getValue());
	}
	}
	
}
	

