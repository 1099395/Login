node {
  def mvnHome = tool 'maven3'
  def dockerHome = 'C:/Program Files/Docker Toolbox'
  stage ("Intial Preparation") {
    bat "echo Preparations are done"
  }
   stage ("Build Code") {
     bat "cd C:/chaitra/loginService && set JAVA_HOME='C:/Program Files/Java/jdk1.8.0_121' && ${mvnHome}/bin/mvn clean package"
     bat "echo code is builded"
   }
  stage ("Build Image"){
    bat "cd C:/chaitra/user-login-service && ${mvnHome}/bin/mvn docker:build"
  }
  
    stage ("Deploy"){
    bat "cd ${kubeHome}/  && kubectl create -f login.yml && kubectl create -f deployment.yml"
 }
}
