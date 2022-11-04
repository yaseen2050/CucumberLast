pipeline{
    agent any
    stages{
        stage('Run Tests'){
           steps{
              sh './mvnw clean test'
              sh './mvnw test'
              sh './mvnw verify'
        }
      }
   }
}