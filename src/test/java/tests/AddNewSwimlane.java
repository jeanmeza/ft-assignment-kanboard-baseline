package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.SwimlanesPage;

import static org.junit.jupiter.api.Assertions.assertTrue;


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
		assertTrue(swimlanes.getLastSwimlaneName().contains("New Swimlane 3"));

	}


}
