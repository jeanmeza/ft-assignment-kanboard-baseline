package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import po.LoginPage;
import po.PermissionsPage;



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
