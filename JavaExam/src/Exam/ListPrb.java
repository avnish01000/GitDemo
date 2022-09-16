package Exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPrb {

	public static void main(String[] args) {
	//list1 = [100,10,-20,99,50]
	//[-1,-1,-1,-20,-20]
		
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> occurence=new ArrayList<Integer>();
		boolean flag=false;
		
		l1.add(100);
		l1.add(10);
		l1.add(-20);
		l1.add(99);
		l1.add(50);
		
		for(int i=0;i<l1.size();i++)
		{
			List<Integer> occ=new ArrayList<Integer>();
			for(int j=0;j<l1.size();j++)
			{
				if(l1.get(i)<l1.get(j))
					occ.add(l1.get(j));
				else
				{
					flag=true;
				}
					
				
			}
			
			if(flag==true)
				occurence.add(-1);
			else
			{
				Collections.sort(occ);
				occurence.add(occ.get(0));			
			}
					
		}
		
		System.out.println(occurence);
		
		

	}

}
