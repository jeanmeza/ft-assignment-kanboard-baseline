package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.UserSummaryPage;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AddRemoteUser extends BaseTest {


	@Test
	public void addRemoteUser() {
		UserSummaryPage user = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.usersManagement()
			.newUser()
			.setUsername("TestRemote")
			.setFullname("remote1")
			.setEmail("remote@gmail.com")
			.setRemote()
			.save();

		// Verify that the created remote user's username is "TestRemote".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Verify that the created remote user's full name is "remote1".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Verify that the created remote user's email is "remote@gmail.com".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Verify that the created user's account type is "Remote".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
	}


}
