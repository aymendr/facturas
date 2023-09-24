pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Building.."
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
                sh '''
                echo "doing delivery stuff.."
                '''
            }
        }
    }
}