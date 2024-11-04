pipeline {
    agent any

    tools {
        // Specify the version of JDK and Maven to use
        jdk 'jdk-11'   // Make sure you have configured this in Jenkins
        maven 'Maven 3.8.1' // Specify the Maven version you have configured in Jenkins
    }

    environment {
        // Optional: Add any environment variables here
    }

    stages {
        stage('Checkout') {
            steps {
                // Clone the GitHub repository
                git branch: 'main', url: 'https://github.com/your-username/your-repo.git'
            }
        }

        stage('Build') {
            steps {
                // Compile the code using Maven
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Run the tests using Maven
                sh 'mvn test'
            }

            post {
                always {
                    // Publish test results (useful for viewing in Jenkins)
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Archive') {
            steps {
                // Archive the generated artifacts (optional)
                archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
            }
        }
    }

    post {
        always {
            // Clean up the workspace after the pipeline completes
            cleanWs()
        }
    }
}
