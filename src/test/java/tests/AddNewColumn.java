package tests;

import org.junit.jupiter.api.Test;
import po.ColumnsPage;
import po.LoginPage;



public class AddNewColumn extends BaseTest {


	@Test
	public void addNewColumn() {
		ColumnsPage columns = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.firstProjectSummary()
			.columns()
			.addColumn()
			.setColumnName("New Column 3")
			.save();

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
