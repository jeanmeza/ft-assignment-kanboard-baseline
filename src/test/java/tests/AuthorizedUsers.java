package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.PermissionsPage;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AuthorizedUsers extends BaseTest {


	@Test
	public void showAuthorizedUsers() {
		PermissionsPage permissions = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.firstProjectSummary()
			.permissions();

		assertEquals("admin", permissions.getFirstAllowedUser());

	}


}
