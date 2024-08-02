package testKeerthi;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class keerthiTest {

	private static String globalParam;

	@Parameters({ "param" })
	@Test
	public void initializeParam(String param) {
		globalParam = param;
	}

	@DataProvider(name = "data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { globalParam + "1", 10 }, { globalParam + "2", 20 }, { globalParam + "3", 30 } };
	}

	@Test(dataProvider = "data-provider", dependsOnMethods = "initializeParam")
	public void myTest(String str, int num) {
		System.out.println("String: " + str + ", Number: " + num);
	}

}
