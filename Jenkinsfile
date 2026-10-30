
pipeline {
    agent any

    triggers {
        pollSCM('H/1 * * * *')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/vineelagera123-blip/JavaCICD.git'
            }
        }

        stage('Compile') {
            steps {
                bat '"C:\\Program Files\\apache-maven-3.9.16\\bin\\mvn.cmd" clean compile'
            }
        }

        stage('Test') {
            steps {
                bat '"C:\\Program Files\\apache-maven-3.9.16\\bin\\mvn.cmd" test'
            }
        }

        stage('Package') {
            steps {
                bat '"C:\\Program Files\\apache-maven-3.9.16\\bin\\mvn.cmd" package -DskipTests'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar',
                             fingerprint: true
        }
    }
}
