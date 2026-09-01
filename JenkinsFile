pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Code Checkout Stage'
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Application'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running Unit Tests'
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Creating JAR'
                bat 'mvn clean package'
            }
        }

    }
}