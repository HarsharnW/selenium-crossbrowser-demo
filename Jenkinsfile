pipeline {
    agent any
    tools {
        maven "Maven"
        jdk "JDK"
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
                bat "mvn clean install -DskipTests"
            }
        }
        stage('test') {
            steps {
                bat "mvn clean install"
            }
        }
    }
}
