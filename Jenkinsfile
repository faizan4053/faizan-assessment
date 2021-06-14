pipeline{
	agent any
	tools {
		jdk 'JDK11'
	}
	stages {
		stage("build") {
			steps {
				echo 'Build has started'
				bat 'mvn --version'
				bat "mvn clean complile"
				echo "Done cleaning and compiling"
			}
		}
		stage('test') {
            steps {
                echo 'Testing source'
                bat 'mvn test'
                echo 'Done Testing'
                
            }
        }
        stage('packaging') {
            steps {
                echo 'Packing jar file'
               	sh 'mvn package -Pprod'
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