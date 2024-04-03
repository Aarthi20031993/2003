package org.github;

public class GitSample {
	
public static void main()   {
		
		System.out.println("Working directory");
		System.out.println("Stagging area");
		System.out.println("Local git repository");
		System.out.println("Remote git repository");
		
		String s="Java Programme";
		
		String op="";
		
		for(int i=s.length()-1;i>=0;i--)  {
			
			char c = s.charAt(i);
			op=op+c;
			
		}
	
		System.out.println(op);
	
	}


}
