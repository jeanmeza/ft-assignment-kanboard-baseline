package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.SearchResultsPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInProject extends BaseTest {

	@Test
	public void searchInProject() {
		SearchResultsPage results = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.search("status:open");

		assertEquals("task 3", results.getFirstTask());

	}


}
