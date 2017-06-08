node {
  def mvnHome = tool 'maven3'
  def dockerHome = 'C:\\dock_test'
  def kubeHome = 'C:\\Kubernetes_1.6'
  
  stage ("Intial Preparation") {
    git credentialsId: 'github-creds', url: 'https://github.com/1099395/Login'
  }
   stage ("Build Code") {
     bat "cd ${workspace}\\user-login-service && ${mvnHome}/bin/mvn clean package"
     bat "echo code is builded"
  }
  stage ("Build image"){
    bat "cd ${workspace}\\scripts && docker_build.bat ${mvnHome}"
    bat "echo image is builded"
  }
  stage ("Push image"){
    bat "cd ${workspace}\\scripts && push_image.bat ${dockerHome}"
    bat "echo image is pushed"
  }
  stage ("Deploy"){
    bat "cd ${kubeHome} && minikube start"
    bat "cd ${kubeHome} && kubectl create -f deployment.yml"
    bat "cd ${kubeHome} && kubectl create -f loginimage.yml"
 } 
}
