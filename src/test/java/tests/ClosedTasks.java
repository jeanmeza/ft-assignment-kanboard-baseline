package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.SearchResultsPage;


public class ClosedTasks extends BaseTest {


	@Test
	public void searchClosedTask() {
		SearchResultsPage results = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.search("status:closed");

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
