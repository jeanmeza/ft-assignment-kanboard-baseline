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

		assertEquals("Italiano", appSettings.getSelectedLanguage());
		assertEquals("Lingua", appSettings.getLanguageLabel());
		appSettings.selectLanguage("English (US)").save();
		assertEquals("English (US)", appSettings.getSelectedLanguage());
		assertEquals("Language", appSettings.getLanguageLabel());

	}


}
