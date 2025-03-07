pipeline {
    agent any  // Runs on any available Jenkins agent

    environment {
        CHROME_DRIVER = "/usr/local/bin/chromedriver"  // Path to ChromeDriver
        DISPLAY = ":99"  // Set display for headless mode
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/mena7899/selenium.git'  // Replace with your Git repository URL
            }
        }

        stage('Setup Environment') {
            steps {
                script {
                    sh 'apt-get update && apt-get install -y unzip wget xvfb'
                    sh 'Xvfb :99 -screen 0 1920x1080x24 &'
                    sh 'export DISPLAY=:99'
                }
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn clean test'  // Runs Selenium tests using Maven
            }
        }

        stage('Publish Reports') {
            post {
                always {
                    junit 'target/surefire-reports/*.xml'  // Publishes JUnit reports
                }
            }
        }
    }
}
