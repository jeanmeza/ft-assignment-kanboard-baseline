package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.SwimlanesPage;


public class AddNewSwimlane extends BaseTest {

	@Test
	public void addNewSwimlane() {
		SwimlanesPage swimlanes = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.firstProjectSummary()
			.swimlanes()
			.addSwimlane()
			.setName("New Swimlane 3")
			.save();
		// Verify that the last swimlane is the newly added "New Swimlane 3".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
