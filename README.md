# CollegeDirectory

How to get started:

- Clone the repository to your local machine using 
the command "git clone https://github.com/aman-jakkani/CollegeDirectory.git"
- Navigate to the project folder CollegeDirectoryDB, and you can either open this
in an IDE like IntelliJ, or simply navigate here using a termainal.
- Start your local MySQL server on port 3306 (this is the default port). Create a database called 
college_db. 
- <b>Make sure</b> you go to application.properties file and input your local SQL server information.
Everything should be unchanged except you need to add your username and password to this properties file. Change
the 3306 in the datasource url if you're MySQL server is on another port.
- Also navigate to pom.xml file on IntelliJ (if using) and make sure all Maven dependencies are installed. This step is automatic 
on IntelliJ.
- If using IntelliJ, click on Run. Else, navigate to the project folder in terminal and type in the command "./mnvw spring-boot:run".
This should start compiling and building the project, and once everything is built, navigate to "localhost:8080" to start using the application!

Data Generation Source: filldb.info

E/R Diagram Builder: https://erdplus.com/standalone
 
