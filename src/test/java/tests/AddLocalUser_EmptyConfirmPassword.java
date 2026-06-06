package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.NewUserPage;

public class AddLocalUser_EmptyConfirmPassword extends BaseTest {

	@Test
	public void addEmptyConfirmation() {
		NewUserPage user = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.usersManagement()
			.newUser()
			.setUsername("TestUser2")
			.setFullname("User2")
			.setEmail("user2@gmail.com")
			.setPassword("test123")
			.saveError();

		// Verify that a confirmation error "The confirmation is required" is shown when the confirmation password is empty.
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}

}
