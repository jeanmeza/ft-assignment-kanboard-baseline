package tests;

import org.junit.jupiter.api.Test;
import po.CurrencyRatesPage;
import po.LoginPage;



public class SetReferenceCurrency extends BaseTest {


	@Test
	public void setReference() {
		CurrencyRatesPage currencies = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.goToSettings()
			.currencyRates()
			.changeReferenceCurrency()
			.selectCurrency("EUR - Euro")
			.save();

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
