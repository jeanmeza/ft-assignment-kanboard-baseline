package tests;


import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.SwimlanesPage;


public class AddEmptySwimlane extends BaseTest {

	@Test
	public void addNewSwimlane() {
		SwimlanesPage swimlanes = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.firstProjectSummary()
			.swimlanes()
			.addSwimlane()
			.save();

		// Verify that an error message "The name is required" is shown when adding a swimlane with an empty name.
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
