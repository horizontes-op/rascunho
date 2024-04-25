pipeline {
    agent any
    stages {
        stage('aluno interface') {
            steps {
                echo 'aluno interface'
            }
        }
        stage('build aluno interface') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}