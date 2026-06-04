package tests;

import org.junit.jupiter.api.Test;
import po.AddNewProjectPage;
import po.LoginPage;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class AddEmptyProject extends BaseTest {

	@Test
	public void addEmptyProject() {
		AddNewProjectPage newProjPage = new LoginPage(driver)
			.loginToKanboard("admin", password)
			.newProject()
			.addEmptyProject();

		assertFalse(newProjPage.getErrorMessage().isEmpty());

	}
}
