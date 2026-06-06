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

		// Verify that an error message "The name is required" is shown when adding a category with an empty name.
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test


	}
}
