package tests;


import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.SwimlanesPage;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class AddEmptySwimlane extends BaseTest {

	@Test
	public void addNewSwimlane() {
		SwimlanesPage swimlanes = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.firstProjectSummary()
			.swimlanes()
			.addSwimlane()
			.save();

		assertTrue(swimlanes.getLastSwimlaneName().isEmpty());

	}


}
