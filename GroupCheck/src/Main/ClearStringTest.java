package Main;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClearStringTest {

	@Test
	public void test() {
		StringHandler sh=new StringHandler();
		String group="([[<adsaafafafa>]])";
		group=sh.ClearString(group);
		assertEquals("([[<>]])", group);
	}

}
