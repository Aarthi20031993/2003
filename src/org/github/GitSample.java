package org.github;

import java.util.ArrayList;
import java.util.List;

public class GitSample {
	
public static void main()   {
		
		System.out.println("Working directory");
		System.out.println("Stagging area");
		System.out.println("Local git repository");
		System.out.println("Remote git repository");
		
		List<String> li=new ArrayList<String>();
		
		li.add("A");
		li.add("B");
		li.add("C");
		li.add("D");
		li.add("E");
		
		for(int i=0;i<li.size();i++)  {
			
			System.out.println(li.get(i));
			
		}
	
	
	}


}
