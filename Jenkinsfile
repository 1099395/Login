node {
  def mvnHome = tool 'maven3'
  def dockerHome = 'C:/Program Files/Docker Toolbox'
  stage ("Intial Preparation") {
    bat "echo Preparations are done"
  }
   stage ("Build Code") {
     bat "cd C:\\chaitra\\login-service && ${mvnHome}/bin/mvn clean package"
     bat "echo code is builded"
   }
  stage ("Build Image"){
    bat "cd C:\\chaitra\\login-service && export DOCKET_HOST=unix:///private/var/tmp/docker.sock && ${mvnHome}/bin/mvn docker:build"
  }
  
    stage ("Deploy"){
    bat "cd ${kubeHome}/  && kubectl create -f login.yml && kubectl create -f deployment.yml"
 }
}
