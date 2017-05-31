node {
  def mvnHome = tool 'maven'
  stage ("Intial Preparation") {
    bat "echo Preparations are done"
  }
   stage ("Build Code") {
     bat "cd C:/chaitra/user-login-service && ${mvnHome}/bin/mvn clean package"
     
     bat "echo code id builded"
  }
  stage ("Build Image"){
    
 }
