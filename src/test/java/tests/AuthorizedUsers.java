package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.PermissionsPage;



public class AuthorizedUsers extends BaseTest {


	@Test
	public void showAuthorizedUsers() {
		PermissionsPage permissions = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.firstProjectSummary()
			.permissions();

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
