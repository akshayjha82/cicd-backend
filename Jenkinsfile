pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t cicd-app .'
            }
        }

        stage('Deploy'){
        steps {
        bat 'docker stop cicd-container'
        bat 'docker rm cicd-container'
        bat 'docker run  -d --name cicd-container -p 8081:8081 cicd-app'
         }
        }

    }
}
