node {
  def mvnHome = tool 'maven3'
  def dockerHome = tool 'Docker'
  stage ("Intial Preparation") {
    bat "echo Preparations are done"
  }
   stage ("Build Code") {
     bat "cd C:/chaitra/login-service && ${mvnHome}/bin/mvn clean package"
     bat "echo code is builded"
  }
  stage ("Build image"){
    bat "cd C:/chaitra/login-service/scripts && docker_build.bat ${mvnHome}"
    bat "echo image is builded"
  }
  stage ("Push image"){
    bat "cd C:/chaitra/login-service/scripts && push_image.bat ${mvnHome}"
    bat "echo image is pushed"
  }
}
