package tests;

import org.junit.jupiter.api.Test;
import po.ApplicationSettingsPage;
import po.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ChangeLanguage extends BaseTest {

	@Test
	public void changeLang() {
		ApplicationSettingsPage appSettings = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.goToSettings()
			.appSettings()
			.selectLanguage("Italiano")
			.save();

		// Verify that the selected language is "Italiano".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Verify that the language label reads "Lingua" (Italian for "Language").
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		appSettings.selectLanguage("English (US)").save();
		// Verify that the selected language is "English (US)" after switching back.
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test
		// Verify that the language label reads "Language" again.
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
