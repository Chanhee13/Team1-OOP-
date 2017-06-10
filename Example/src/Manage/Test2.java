package Manage;

import Information.*;

public class Test2 {
	
	public void go(){
		
		Information a = new Information(1);
		
		for(int i=0;i<a.getAssingments().size();i++)
		{
		   System.out.println(a.getAssingments().get(i).getProblem());
		   System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Test2 test = new Test2();
		test.go();
		
	}

}
