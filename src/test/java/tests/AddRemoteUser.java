package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.UserSummaryPage;



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

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
	}


}
