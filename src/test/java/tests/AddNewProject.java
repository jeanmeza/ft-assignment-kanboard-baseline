package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.ProjectSummaryPage;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AddNewProject extends BaseTest {


	@Test
	public void addNewProject() {
		ProjectSummaryPage project = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.newProject()
			.addNewProject("Test 2");

		// Verify that the new project's title is "Test 2".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Verify that the new project's status is "This project is open".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test


	}


}
