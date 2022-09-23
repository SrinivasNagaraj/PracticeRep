package Practice;

import org.testng.annotations.Test;

public class Practice2Test {
@Test
public void test() {
	String browser = System.getProperty("b");
	String url = System.getProperty("u");
	System.out.println(browser);
	System.out.println(url);
}

}
