package testsuites;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testscripts.LoginTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({LoginTests.class})
public class DemoSuite {
}
