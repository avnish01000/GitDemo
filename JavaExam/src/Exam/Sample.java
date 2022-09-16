package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0};
		Arrays.sort(arr1);
		
		HashMap<Integer, Integer> mp=new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> mpindex=new HashMap<Integer, Integer>();
		int count=0;
		
		for(int i: arr1)
		{
			count++;
			if(mp.containsKey(i))
			{
				mp.put(i, mp.get(i)+1);
				mpindex.put(i, count);
			}
			else
			{
				mp.put(i, 1);
				mpindex.put(i, count);
			
			}
		}
		
		
	/*	for(int i=0;i<arr1.length;i++)
		{
			
			for(int j=0;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
				mpindex.put[arr1[i],j];
				}
					
			}
		}*/
		
		System.out.println(mp);
		System.out.println(mpindex);
		
	}

}
