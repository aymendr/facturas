pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Building.."
                bat 'mvn clean install'
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