cd %1
minikube start
minikube dashboard
kubectl create -f deployment.yml
kubectl create -f loginimage.yml
