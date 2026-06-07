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
                sh 'javac Hello.java HelloTest.java'
            }
        }
        stage('Test') {
            steps {
                sh 'java HelloTest'
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
            echo 'All stages passed!'
        }
        failure {
            echo 'Pipeline failed — check the stage that went red.'
        }
    }
}
