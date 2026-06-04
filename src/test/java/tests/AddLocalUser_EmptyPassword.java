package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.NewUserPage;


public class AddLocalUser_EmptyPassword extends BaseTest {

	@Test
	public void addEmptyPassword() {
		NewUserPage user = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.usersManagement()
			.newUser()
			.setUsername("TestUser2")
			.setFullname("User2")
			.setEmail("user2@gmail.com")
			.saveError();

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}

}
