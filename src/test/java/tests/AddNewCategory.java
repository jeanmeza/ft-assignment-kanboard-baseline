package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import po.CategoriesPage;
import po.LoginPage;



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

		Assertions.assertEquals("New Category 2", categories.getCategoryName());
	}


}
