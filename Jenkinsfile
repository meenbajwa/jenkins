pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Cloning repo...'
            }
        }
        stage('Build') {
            steps {
                sh 'javac Hello.java'
            }
        }
        stage('Run') {
            steps {
                sh 'java Hello'
            }
        }
    }

    post {
        success {
            echo 'Pipeline finished successfully!'
        }
        failure {
            echo 'Something went wrong.'
        }
    }
}
