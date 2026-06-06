package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.ProjectManagementPage;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AddNewTask extends BaseTest {


	@Test
	public void addNewTask() {
		ProjectManagementPage project = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.goToFirstProject()
			.newTask()
			.setNewTaskName("task 3")
			.saveNewTask();
		// Verify that the first task in the project is the newly created "task 3".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
