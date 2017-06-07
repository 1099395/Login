node {
  def mvnHome = tool 'maven3'
  def dockerHome = 'C:/Program Files/Docker Toolbox'
  stage ("Intial Preparation") {
    bat "echo Preparations are done"
  }
   stage ("Build Code") {
      bat "cd C://chaitra//login-service/scripts && sh docker_build.sh ${mvnHome}"
  }
  
    stage ("Deploy"){
    bat "cd ${kubeHome}/  && kubectl create -f login.yml && kubectl create -f deployment.yml"
 }
}
