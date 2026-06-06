package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.ProjectManagementPage;


public class AddEmptyTask extends BaseTest {


	@Test
	public void addEmptyTask() {
		ProjectManagementPage project = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.goToFirstProject()
			.newTask()
			.setNewTaskName("")
			.saveNewTask();
		// Verify that an error message "The title is required" is shown when saving a task with an empty title.
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
