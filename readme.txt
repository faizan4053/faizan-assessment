--- How Jenkins file Works ---


- Jenkinsfile will help to automate build ,test  and deploy processes.

-Jenkinsfile contains Pipeline script or commands or stages to execute the job in the order of these stages.

-The job creation will be of Multibranch Pipeline and in the configuration file we need to specify the git repository link.


Below is the command structure for the same

When we build the Pipeline, Jenkins automatically detects the stages from Jenkinsfile and execute in that order

1) First stage is 'build' 
	
		mvn clean compile 
		
		It will compile clean the existing build for the project and compile the fresh build 
		for the project
		
2) Second stage 'test'

		mvn test
		
		It will test the unit tests which will be present in the project
		
3) Third stage 'Deploy'
		
		mvn package
		
		This command will create a jar package for the project to deploy.