pipeline {
    agent any

    stages {
        stage('Build') {
            steps{
                sh 'javac -d . src/main/java/org.example/Main.java'
            }
        }
    }
}