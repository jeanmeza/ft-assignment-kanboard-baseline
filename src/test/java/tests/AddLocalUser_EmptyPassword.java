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

		// Verify that a password error "The password is required" is shown when the password field is empty.
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}

}
