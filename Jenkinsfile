node {
  def mvnHome = tool 'maven'
  def dockerHome = 'C:/Program Files/Docker Toolbox'
  stage ("Intial Preparation") {
    bat "echo Preparations are done"
  }
   stage ("Build Code") {
     bat "cd C:/chaitra/user-login-service && ${mvnHome}/bin/mvn clean package"
     bat "echo code is builded"
   }
  stage ("Build Image"){
    bat "cd C:/chaitra/user-login-service && ${mvnHome}/bin/mvn docker:build"
  }
  stage ("Push Image"){
    bat "cd C:/chaitra/user-login-service && ${dockerHome}/docker login --username "coe1099395" --password "Chai@123" && ${dockerHome}/docker push 1099395/loginimage"
  }
    stage ("Deploy"){
    bat "cd ${kubeHome}/  && kubectl create -f login.yml && kubectl create -f deployment.yml"
 }
}
