node {
  def mvnHome = tool 'maven3'
  def dockerHome = 'C:\\dock_test'
  
  stage ("Intial Preparation") {
    git credentialsId: 'github-creds', url: 'https://github.com/1099395/Login'
  }
   stage ("Build Code") {
     bat "cd ${workspace}\\Login && ${mvnHome}/bin/mvn clean package"
     bat "echo code is builded"
  }
  stage ("Build image"){
    bat "cd ${workspace}\\Login\\scripts && docker_build.bat ${mvnHome}"
    bat "echo image is builded"
  }
  stage ("Push image"){
    bat "cd cd ${workspace}\\Login\\scripts && push_image.bat ${dockerHome}"
    bat "echo image is pushed"
  }
}
