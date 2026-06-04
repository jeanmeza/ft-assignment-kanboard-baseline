package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.UsersManagementPage;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class RemoveUser extends BaseTest {


	@Test
	public void removeUser() {
		UsersManagementPage users = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.usersManagement()
			.removeFirstUser();

		assertFalse(users.containsUser("remote1"));

	}


}
