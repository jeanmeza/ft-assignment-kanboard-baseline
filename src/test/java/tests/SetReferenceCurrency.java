package tests;

import org.junit.jupiter.api.Assertions;
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

		Assertions.assertEquals("EUR - Euro", currencies.getReferenceCurrency());
	}


}
