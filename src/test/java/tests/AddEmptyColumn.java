package tests;

import org.junit.jupiter.api.Test;
import po.ColumnsPage;
import po.LoginPage;


public class AddEmptyColumn extends BaseTest {

	@Test
	public void addEmptyColumn() {
		ColumnsPage columns = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.firstProjectSummary()
			.columns()
			.addColumn()
			.save();

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}
}
