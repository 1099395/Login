cd C:\chaitra\login-service
SET DOCKER_TLS_VERIFY=1
SET DOCKER_HOST=tcp://192.168.99.103:2376
SET DOCKER_CERT_PATH=C:\Users\1099395\.docker\machine\machines\default
SET DOCKER_MACHINE_NAME=default
SET COMPOSE_CONVERT_WINDOWS_PATHS=true
REM Run this command to configure your shell:
REM     @FOR /f "tokens=*" %i IN ('docker-machine env default') DO @%i
%1\bin\mvn docker:build
