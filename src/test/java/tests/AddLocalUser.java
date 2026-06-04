package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.UserSummaryPage;



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

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
