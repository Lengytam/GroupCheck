package Main;

public class StringHandler {
	
	public StringHandler(){
		
	}
	public static String ClearString(String s)
	{
		String p=s.replaceAll("[^(\\[<{}>\\])]", "");
		
		return p;
	}
	public static boolean GC(MyStack st)
	{
		MyStack stack=st;
		Character c;
		MyStack groupend=new MyStack();
		String closebrackets="}>])";
		while(true)
		{
			if(closebrackets.indexOf(c=stack.Pop())>-1)
			{
				groupend.Push(c);
			}
			else if(stack.top>-1)
			{
				//stack.Push(c);
				while( IsPair(c,groupend.Pop()) )
				{
					c=stack.Pop();
					if(c=='-')break;
				}
				if(stack.top>-1)
					return false;
				else
					return true;
			}
			else
			{
				return false;
			}
		}
		
	}
	public static boolean IsPair(Character c, Character d)
	{
		if((c=='[' && d==']') || (c=='{' && d=='}') || (c=='(' && d==')') || (c=='<' && d=='>'))
			return true;
		else
			return false;
	}
}
