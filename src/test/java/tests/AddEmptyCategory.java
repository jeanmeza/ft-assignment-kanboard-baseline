package tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import po.CategoriesPage;
import po.LoginPage;


public class AddEmptyCategory extends BaseTest {

	@Test
	public void addEmptyCategory() {
		CategoriesPage categories = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.firstProjectSummary()
			.categories()
			.addCategory()
			.save();

		Assertions.assertTrue(categories.getErrorMessage().contains("Name is required"));

	}
}
