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

		assertEquals("TestRemote", user.getUsername());
		assertEquals("remote1", user.getFullname());
		assertEquals("remote@gmail.com", user.getEmail());
		assertEquals("Remote", user.getAccountType());
	}


}
