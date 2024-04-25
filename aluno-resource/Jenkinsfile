pipeline {
    agent any
    stages {
        stage('aluno interface') {
            steps {
                build job: 'aluno', wait: true
            }
        }
        stage('aluno') { 
            steps {
                sh 'mvn clean package'
            }
        }      
        stage('build image aluno') {
            steps {
                script {
                    account = docker.build("fernandowi55/aluno:${env.BUILD_ID}", "-f Dockerfile .")
                }
            }
        }
        stage('push image aluno') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub-credential') {
                        account.push("latest")
                        account.push("${env.BUILD_ID}")
                       
                    }
                }
            }
        }

        
    }
}