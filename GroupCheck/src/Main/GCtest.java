package Main;

import static org.junit.Assert.*;

import org.junit.Test;

public class GCtest {
	MyStack ms=new MyStack();
	StringHandler sh=new StringHandler();
	String group;
	
	//Szövegértelmezés tesztje
	@Test
	public void testGC() {
		group="([[<adsaafafafa>]])";
		group=sh.ClearString(group);
		ms.Push(group);
		boolean b=sh.GC(ms);
		assertEquals(true, b);
	}
	
	@Test(timeout=4000 /*, expected=IndexOutOfBoundsException.class*/)
	public void testGCnegatively(){
		group="([[<(adsaafafafa>]])";
		group=sh.ClearString(group);
		ms.Push(group);
		boolean b=sh.GC(ms);
		assertEquals(false, b);
	}

}
