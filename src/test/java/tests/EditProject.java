package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.ProjectSummaryPage;



public class EditProject extends BaseTest {


	@Test
	public void editProduct() {
		ProjectSummaryPage project = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.firstProjectSummary()
			.editProject()
			.setDescription("This is the new description")
			.save()
			.summary();

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test


	}


}
