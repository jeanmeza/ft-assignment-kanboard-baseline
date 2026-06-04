package tests;

import org.junit.jupiter.api.Test;
import po.LoginPage;
import po.ProjectManagementPage;



public class AddNewTask extends BaseTest {


	@Test
	public void addNewTask() {
		ProjectManagementPage project = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.goToFirstProject()
			.newTask()
			.setNewTaskName("task 3")
			.saveNewTask();
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test

	}


}
