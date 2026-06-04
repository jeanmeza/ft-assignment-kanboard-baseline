package tests;


import org.junit.jupiter.api.Test;
import po.CategoriesPage;
import po.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddEmptyCategory extends BaseTest {

	@Test
	public void addEmptyCategory() {
		CategoriesPage categories = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.firstProjectSummary()
			.categories()
			.addCategory()
			.save();

		assertEquals("The name is required", categories.getErrorMessage());


	}
}
