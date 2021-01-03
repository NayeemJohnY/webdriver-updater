** About **
	 This project helps to autoupdate of driver executables based on the browser version in the Node machines and start the node with the command line configurations.
	 
**Set up the project in local from Remote:**

1. If you haven't already cloned the repository locally

    ***git clone http://[username]@stash.corp.web:7990/scm/ctaf/webdriverupdater.git***

2. Switch to the ***master*** branch

    ***git checkout master***

3. Run the project with maven command
	***mvn clean package***
	
4. After running the maven command a jar **WebDriverUpdater-0.0.1-SNAPSHOT-jar-with-dependencies.jar** will be installed in the **target** folder of project.

** Usage of this JAR?**

	This JAR helps to manage the driver executables and start the selenium Grid node.

** What are components this JAR contains?**
	1. It contains Webdriver Manager setup (*Dependency-Webdriver Manager*)
		a. It helps to download the latest driver executable based on the browser version available in system.   It downloads to the folder **~\m2\repository\webdriver**.
		b. Currently only the chrome driver set up is used so it downloads the chrome driver. In future we can add IE, Firefox if required.
		c. After download the executable path will be specified on properties.
		
	2. Grid Node launcher (*Dependency-selenium server*)
		After the driver executables are set up, it starts the node with the arguments passed (role, hubURL, NodeCOnfig.json)
		
** How to use this JAR? ** 
	1. Add the created a JAR in folder where the node configuration JSON anode startNode batch file resides.
	2. Update the batch file with the following command.
		**“java -jar WebDriverUpdater-0.0.1-SNAPSHOT-jar-with-dependencies.jar -role node -hub          http://10.161.127.177:4444/grid/register/ -nodeConfig NodeConfig.json”**
		
**Note : After this update, there is no need to maintain the driver executables in remote. **

As this solution is for the node machines, to extend this solution on local runs. Each project code base needs to be modified to use the Webdriver Manager dependency instead of mentioning driver executables file path. Once these code changes are done then project itself are capable to manage driver executables without this JAR.
	
