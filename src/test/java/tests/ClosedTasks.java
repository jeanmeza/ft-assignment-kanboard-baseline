package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.SearchResultsPage;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ClosedTasks extends BaseTest {


	@Test
	public void searchClosedTask() {
		SearchResultsPage results = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.search("status:closed");

		assertNotNull(results.getFirstTask());

	}


}
