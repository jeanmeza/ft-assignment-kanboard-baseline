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

		// Verify that the new project's title is "Test private 2".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Verify that the new project's status is "This project is open".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Verify that the project's access level indicates "This project is personal".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Verify that public access is "Public access disabled".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
