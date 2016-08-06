package Main;

import java.util.ArrayList;

public class MyStack {

	int top;
	private ArrayList<Character> charstack;
	public MyStack()
	{
		charstack=new ArrayList<Character>();
		top=-1;
	}
	public Character peek()
	{
		if(top>-1)
			return charstack.get(top);
		else
			return '-';	
	}
	public void Push(Character c)
	{
		charstack.add(c);
		top++;
	}
	public void Push(String s)
	{
		for(Character c:s.toCharArray())
			Push(c);
	}
	public Character Pop()
	{
		Character c;
		if(top>-1)
		{	
			c= charstack.get(top);
			charstack.remove(top);
			top--;
		}
		else
			c='-';
		return c;
	}
	public String toString(){
		StringBuilder builder = new StringBuilder(charstack.size());
	    for(Character ch: charstack)
	    {
	        builder.append(ch);
	    }
	    return builder.toString();
	}
	
	
}
