package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.ProjectListPage;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class RemoveProject extends BaseTest {


	@Test
	public void removeProject() {
		ProjectListPage projects = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.firstProjectSummary()
			.remove();

		assertFalse(projects.containsProject("Test 2"));

	}

}
