package javaProgram;

import java.util.HashMap;

public class CountTheNoOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1 ;
		String str = "sadhana is a  a good girl sadhana sadhana";
		String[] strArry = str.split(" ");
		int size = strArry.length ;
		System.out.println( size);
		HashMap<String , Integer> map = new HashMap<String , Integer>();
		for(int i=0 ; i< size ; i++)
		{
			if(map.containsKey(strArry[i]))
			{
			    count = map.get(strArry[i]);
				map.put(strArry[i], count+1);
			}
			else
			{
				map.put(strArry[i], 1);
			}
			
		}
		System.out.println( map );

	}

}
