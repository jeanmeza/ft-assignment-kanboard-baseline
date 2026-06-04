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

		assertTrue(columns.getLastColumnName().contains("New Column 3"));

	}


}
