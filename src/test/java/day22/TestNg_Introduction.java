package day22;

import org.testng.annotations.Test;

public class TestNg_Introduction {
	@Test (priority=1)
	void openApp() {
		System.out.println("opening App...");
	}
	@Test (priority=2)
	void Login() {
		System.out.println("Login to app");
	}
	@Test (priority=3)
	void Logout() {
		System.out.println("Logout App");
	}

}
