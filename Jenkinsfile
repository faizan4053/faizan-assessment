pipeline{
	agent any
	tools {
		jdk 'JDK11'
	}
	stages {
		stage("build") {
			steps {
				echo 'Build has started'
				sh 'mvn --version'
				sh 'mvn clean compile'
				echo 'Build has done successfully'
			}
		}
		stage('test') {
            steps {
                echo 'Testing source'
                sh 'mvn test'
                echo 'Testing has done successfully'
                
            }
        }
        stage('deploy') {
            steps {
                echo 'Packing jar file'
               	sh 'mvn package'
               	echo 'Done packaging'
            }
        }
		
	}

	post {
		always {
			echo 'JENKINS PIPELINE'
			cleanWs()
		}
		success {
            echo 'JENKINS PIPELINE SUCCESSFUL'
        }
        failure {
            echo 'JENKINS PIPELINE FAILED'
        }
        unstable {
            echo 'JENKINS PIPELINE WAS MARKED AS UNSTABLE'
        }
        changed {
            echo 'JENKINS PIPELINE STATUS HAS CHANGED SINCE LAST EXECUTION'
        }
	}
}