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

		assertEquals(user.getUsername(), "TestRemote");
		assertEquals(user.getFullname(), "remote1");
		assertEquals(user.getEmail(), "remote@gmail.com");
		assertEquals(user.getAccountType(), "Remote");
	}


}
