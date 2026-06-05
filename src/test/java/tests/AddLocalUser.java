package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.UserSummaryPage;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AddLocalUser extends BaseTest {


	@Test
	public void addLocalUser() {
		UserSummaryPage user = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.usersManagement()
			.newUser()
			.setUsername("TestUser")
			.setFullname("User1")
			.setEmail("user@gmail.com")
			.setPassword("test123")
			.confirmPassword("test123")
			.save();

		assertEquals("TestUser", user.getUsername());
		assertEquals("User1", user.getFullname());
		assertEquals("user@gmail.com", user.getEmail());

	}


}
