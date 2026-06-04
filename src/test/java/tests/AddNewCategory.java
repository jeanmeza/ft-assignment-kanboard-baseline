package tests;

import org.junit.jupiter.api.Test;
import po.CategoriesPage;
import po.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class AddNewCategory extends BaseTest {

	@Test
	public void addNewCategory() {
		CategoriesPage categories = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.firstProjectSummary()
			.categories()
			.addCategory()
			.setName("New Category 2")
			.save();

		assertTrue(categories.getCategoryName().contains("New Category 2"));

	}


}
