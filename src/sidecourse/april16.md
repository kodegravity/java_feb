## Jenkins 



pipeline {
agent any

    tools{
        maven 'Maven3'
    }
    stages {
        stage('Clone github code ') {
            steps {
                git 'https://github.com/kodegravity/SpringTest.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }


        stage('install') {
            steps {
                sh 'mvn install'
            }
        }


        stage('Run the test') {
            steps {
                sh 'mvn test'
            }
        }


        stage('deploy the code to DEV') {
            steps {
                echo 'Hello World'
                sleep 30
            }
        }

        stage('deploy the code to staging') {
            steps {
                echo 'Hello World'
                sleep 40
            }
        }

        stage('deploy to PROD') {
            steps {
                echo 'Hello World'
                sleep 30
            }
        }
    }
}
