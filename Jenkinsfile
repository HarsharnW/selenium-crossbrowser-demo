pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }
    stages {
        stage ('Initialize') {
            steps {
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
            }
        }
        stage('build') {
            steps {
                mvn clean install -DskipTests
            }
        }
        stage('test') {
            steps {
                mvn clean install
            }
        }
    }
}
