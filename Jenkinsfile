pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Building 2 .."
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
            }
        }
        stage('Deliver') {
            steps {
                echo 'Deliver....'
            }
        }
    }
}
