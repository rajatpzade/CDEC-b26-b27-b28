pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
                git 'https://github.com/rajatpzade/studentapp.ui.git' 
            }
        }
        stage('Build') { 
            steps {
               sh 'mvn clean pcakage'
            }
        }
        stage('Test') { 
            steps {
                echo 'hurreyyy test successfull'
            }
        }
        stage('Deploy') { 
            steps {
               echo 'Thank You to Deploy' 
            }
        }        
    }
}