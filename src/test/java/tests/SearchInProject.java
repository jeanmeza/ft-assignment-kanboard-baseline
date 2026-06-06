package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.SearchResultsPage;

public class SearchInProject extends BaseTest {

	@Test
	public void searchInProject() {
		SearchResultsPage results = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.search("status:open");

		// Verify that the first result of the open-tasks search is "task 3".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
