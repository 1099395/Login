cd %1
minikube start
minikube ip
kubectl create -f deployment.yml
kubectl create -f loginimage.yml
