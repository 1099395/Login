node {
  def mvnHome = tool 'maven3'
  def javaHome = tool 'java8'
  stage ("Intial Preparation") {
    bat "echo Preparations are done"
  }
   stage ("Build Code") {
     bat "cd C:/chaitra/user-login-service && set JAVA_HOME=${javaHome} && ${mvnHome}/bin/mvn clean package"
  }
 }
