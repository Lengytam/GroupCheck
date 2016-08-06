package Main;

import java.util.ArrayList;

public class Starter {
	
	private static StringHandler sh;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sh=new StringHandler();
		MyStack groupcheck=new MyStack();
		String group="([[<adsaafafafa>]])";
		group=ClearString(group);
		groupcheck.Push(group);
		boolean b=sh.GC(groupcheck);
		System.out.println(b);
	}
	public static String ClearString(String s)
	{
		String p=s.replaceAll("[^(\\[<{}>\\])]", "");
		
		return p;
	}
	
}
