pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://your-git-repo-url.git'  // Replace with your repository URL
            }
        }

        stage('Install Dependencies') {
            steps {
                sh 'mvn clean install -DskipTests'  // Install dependencies without running tests
            }
        }

        stage('Run Selenium Tests') {
            steps {
                sh 'mvn test'  // Runs TestNG tests using testng.xml
            }
        }

        stage('Publish TestNG Report') {
            post {
                always {
                    publishTestNGResults testResultsPattern: '**/target/surefire-reports/testng-results.xml', escapeTestDescription: false, escapeExceptionMessages: false
                }
            }
        }
    }
}
