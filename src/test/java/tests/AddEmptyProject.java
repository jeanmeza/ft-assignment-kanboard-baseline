package tests;

import org.junit.jupiter.api.Test;
import po.AddNewProjectPage;
import po.LoginPage;



public class AddEmptyProject extends BaseTest {

	@Test
	public void addEmptyProject() {
		AddNewProjectPage newProjPage = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.newProject()
			.addEmptyProject();

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test


	}
}
