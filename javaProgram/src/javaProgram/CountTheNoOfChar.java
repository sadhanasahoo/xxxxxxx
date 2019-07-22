package javaProgram;

import java.util.HashMap;

public class CountTheNoOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="programming";
		int count = 1 ;
		int i;
		HashMap<Character , Integer> map = new HashMap<Character , Integer>();
		for(i =0 ; i< str.length() ; i++)
		{
			//System.out.println( str.charAt(i));
		if(map.containsKey(str.charAt(i)))
		{
			count = map.get(str.charAt(i));
			map.put(str.charAt(i), count+1);
		}
		else{
			map.put(str.charAt(i), 1);
		}
		
	}
		System.out.println(map);
	
	
	}
}
