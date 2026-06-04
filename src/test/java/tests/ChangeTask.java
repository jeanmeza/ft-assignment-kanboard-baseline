package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.TaskPage;


public class ChangeTask extends BaseTest {

	@Test
	public void changeTask() {
		TaskPage task = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.goToProject("Test 2")
			.goToTask("task 3")
			.closeTask()
			.confirmCloseTask();

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
