package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.NewUserPage;

public class AddLocalUser_EmptyUsername extends BaseTest {

	@Test
	public void addEmptyUser() {
		NewUserPage user = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.usersManagement()
			.newUser()
			.setFullname("User2")
			.setEmail("user2@gmail.com")
			.setPassword("test123")
			.confirmPassword("test123")
			.saveError();

		// Verify that a username error "The username is required" is shown when the username field is empty.
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}

}
