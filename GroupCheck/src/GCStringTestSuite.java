import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Main.ClearStringTest;
import Main.GCtest;

@RunWith(Suite.class)
@SuiteClasses({
	ClearStringTest.class,
	GCtest.class
	})
public class GCStringTestSuite {

}
