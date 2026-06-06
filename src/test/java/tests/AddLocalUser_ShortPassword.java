package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.NewUserPage;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class AddLocalUser_ShortPassword extends BaseTest {

	@Test
	public void addShortPassword() {
		NewUserPage user = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.usersManagement()
			.newUser()
			.setUsername("TestUser2")
			.setFullname("User2")
			.setEmail("user2@gmail.com")
			.setPassword("test")
			.confirmPassword("test")
			.saveError();

		assertFalse(user.getPswError().isEmpty());
	}

}
