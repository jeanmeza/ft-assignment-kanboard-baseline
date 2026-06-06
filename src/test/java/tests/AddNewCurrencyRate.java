package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import po.CurrencyRatesPage;
import po.LoginPage;


public class AddNewCurrencyRate extends BaseTest {


	@Test
	public void addNewCurrencyRate() {
		CurrencyRatesPage currencies = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.goToSettings()
			.currencyRates()
			.addCurrencyRate()
			.setRate("1.2")
			.save();

		Assertions.assertEquals("1.2", currencies.getRateValue());
		Assertions.assertNotNull(currencies.getRateCurrency());
	}

}
