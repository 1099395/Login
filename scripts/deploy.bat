SET DOCKER_TLS_VERIFY=1
SET DOCKER_HOST=tcp://192.168.99.103:2376
SET DOCKER_CERT_PATH=C:\Users\1099395\.docker\machine\machines\default
SET DOCKER_MACHINE_NAME=default
SET COMPOSE_CONVERT_WINDOWS_PATHS=true
cd %1
minikube start
kubectl create -f deployment.yml
kubectl create -f loginimage.yml
