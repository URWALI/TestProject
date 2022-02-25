package JunitCase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testcasemul.class, testcasesum.class })
public class AllTests {

}
