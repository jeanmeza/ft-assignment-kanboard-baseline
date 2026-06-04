package tests;

import org.junit.jupiter.api.Test;
import po.BoardSettingsPage;
import po.LoginPage;



public class ChangeBoardSettings extends BaseTest {


	@Test
	public void changeBoardSettings() {
		BoardSettingsPage boardSettings = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.goToSettings()
			.boardSettings()
			.setPublicrefreshIntgerval("85")
			.save()
			.appSettings()
			.boardSettings();

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
