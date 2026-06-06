package tests;


import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.UserSummaryPage;


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

		// Verify that the admin user's email was updated to "admin@kanboard.com".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
