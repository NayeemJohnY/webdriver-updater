package utils;

import org.openqa.grid.selenium.GridLauncherV3;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NodeWithDriverSetup {
	/**
	 * Main Method which set up Driver at gird node and start the grid node
	 * @param args Command Line Parameters for Node configuration
	 */
	public static void main(String[] args) {
		/*
		 * This will check the driver versions for the browser in the local repository
		 * (ie., ~\m2\repository\webdriver If the driver is not available then download
		 * the driver based on the browser version available in the System. Then the
		 * driver path will be set to the webdriver.chrome.driver property for the use
		 */
		WebDriverManager.chromedriver().setup();
		/*
		 * This method start the selenium grid node based on command line parameters
		 * The driver will be set up on this node by the above line of code
		 */
		GridLauncherV3.main(args);

	}

}
