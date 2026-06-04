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

		assertEquals("Test 2", project.getTitle());
		assertEquals("This project is open", project.getStatus());


	}


}
