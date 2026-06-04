package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.UsersManagementPage;



public class RemoveUser extends BaseTest {


	@Test
	public void removeUser() {
		UsersManagementPage users = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.usersManagement()
			.removeFirstUser();

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
