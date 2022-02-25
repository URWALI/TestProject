package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo 
{

	public static void main(String[] args) 
	{

		//List list=new ArrayList();
		Set list=new HashSet();
		list.add("Urwali");
		list.add(33);
		list.add("Urmil");
		list.add("Hari");
		list.add("Aayushi");
		
//		list.add("Urwali");
//		list.add(true);
//		list.add(4.5);
		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
//			
		Iterator itr= list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
				

	}

}
