package tests;

import org.junit.jupiter.api.Test;
import po.ColumnsPage;
import po.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;


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

		// Verify that the last column is the newly added "New Column 3".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
