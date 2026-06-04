package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.ProjectSummaryPage;



public class AddNewPrivateProject extends BaseTest {


	@Test
	public void addNewPrivateProject() {
		ProjectSummaryPage project = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.newPersonalProject()
			.addNewProject("Test private 2");

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
