package tests;


import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.UserSummaryPage;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class EditProfile extends BaseTest {

	@Test
	public void editProfile() {
		UserSummaryPage user = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.goToSettings()
			.usersManagement()
			.goToUser("admin")
			.editProfile()
			.setEmail("admin@kanboard.com")
			.save();

		assertEquals("admin@kanboard.com", user.getEmail());

	}


}
