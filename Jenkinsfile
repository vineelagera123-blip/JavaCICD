
pipeline {
    agent any

    triggers {
        pollSCM('H/1 * * * *')
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
                echo 'Source code checked out from GitHub'
            }
        }

        stage('Compilation') {
            steps {
                bat '"C:\\Program Files\\apache-maven-3.9.16\\bin\\mvn.cmd" clean compile'
            }
        }

        stage('Testing') {
            steps {
                bat '"C:\\Program Files\\apache-maven-3.9.16\\bin\\mvn.cmd" test'
            }
        }

        stage('Packaging') {
            steps {
                bat '"C:\\Program Files\\apache-maven-3.9.16\\bin\\mvn.cmd" package -DskipTests'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar'
            echo 'Build completed successfully!'
        }

        failure {
            echo 'Build failed!'
        }
    }
}
