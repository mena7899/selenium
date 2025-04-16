pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://your-git-repo-url.git'  // Replace with the project repository URL
            }
        }

        stage('Install Dependencies') {
            steps {
                sh 'mvn clean install -DskipTests'  // Install dependencies without running tests
            }
        }

        stage('Run Selenium Tests') {
            steps {            
               sh 'mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml -Dci=true -Dchrome.options="--headless,--disable-gpu,--window-size=1280,720"'
  // Runs TestNG tests using testng.xml(it can have more than one testng.xml files seperated by comma)
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
