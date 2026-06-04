package tests;

import org.junit.jupiter.api.Test;
import po.ColumnsPage;
import po.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class AddEmptyColumn extends BaseTest {

	@Test
	public void addEmptyColumn() {
		ColumnsPage columns = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.firstProjectSummary()
			.columns()
			.addColumn()
			.save();

		assertTrue(columns.getLastColumnName().isEmpty());
	}
}
