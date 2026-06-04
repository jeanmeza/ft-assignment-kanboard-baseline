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

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
