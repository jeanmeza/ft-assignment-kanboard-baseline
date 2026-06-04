package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.ProjectListPage;



public class RemoveProject extends BaseTest {


	@Test
	public void removeProject() {
		ProjectListPage projects = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.firstProjectSummary()
			.remove();

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}

}
