package tests;

import org.junit.jupiter.api.Test;
import po.ApplicationSettingsPage;
import po.LoginPage;



public class ChangeLanguage extends BaseTest {

	@Test
	public void changeLang() {
		ApplicationSettingsPage appSettings = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.goToSettings()
			.appSettings()
			.selectLanguage("Italiano")
			.save();

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		appSettings.selectLanguage("English (US)").save();
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
