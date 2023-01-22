# Personal reminders
> gRPC-web POC

![diagram](static/web-grpc.drawio.svg)

## Issues
* `net.devh:grpc-server-spring-boot-starter` is not yet compatible with spring-boot 3.0.0 - an older version is used atm | [![GitHub issues open](https://img.shields.io/github/issues/detail/state/yidongnan/grpc-spring-boot-starter/795)](https://github.com/yidongnan/grpc-spring-boot-starter/issues/795)
## Description
Small app to keep track of TODOs.

## TL;DR
* generate selfsigned certs
```
cd local_tls
openssl req -x509 -nodes -subj "/CN=localhost" -addext "subjectAltName = DNS:localhost" -newkey rsa:4096 -sha256 -keyout server.key -out server.crt -days 3650
```
* build and run
```
docker-compose build
docker-compose up
```
* optional if fails
```
docker-compose build fe-base be-base
```
## Technology stack
### Frontend
* JavaScript [ES6]
* NodeJS [v16.19.0] npm [9.2.0]
* React [18.2.0]
* protoc [3.15.8]
* grpc-web [1.4.2]
### Backend
* Java [19]
* SpringBoot [2.7.5]
* Gradle [7.6]
* gRPC [1.51.0]
### Commons
* PostgreSQL [15.1]
* Docker [20.10.7]
* docker-compose [1.29.2]
* nginx [1.23.3]
* envoy [v1.24]

## Installments
### Java
> java jdk
```
cd /opt
wget https://download.java.net/java/GA/jdk19.0.1/afdd2e245b014143b62ccb916125e3ce/10/GPL/openjdk-19.0.1_linux-x64_bin.tar.gz
tar -xvf openjdk-19.0.1_linux-x64_bin.tar.gz
mv jdk-19.0.1 /usr/lib/jvm/
rm openjdk-19.0.1_linux-x64_bin.tar.gz
sudo update-alternatives --install /usr/bin/java java /usr/lib/jvm/jdk-19.0.1/bin/java 5
update-alternatives --config java
java --version
```

### psql
> postgresql client
```
sudo sh -c 'echo "deb http://apt.postgresql.org/pub/repos/apt $(lsb_release -cs)-pgdg main" > /etc/apt/sources.list.d/pgdg.list'
wget -qO- https://www.postgresql.org/media/keys/ACCC4CF8.asc | sudo tee /etc/apt/trusted.gpg.d/pgdg.asc &>/dev/null
sudo apt update
sudo apt install postgresql-client-common postgresql-client-15 -y
```

### protoc
> protobuf compiler & protoc-gen-grpc-web
```
sudo apt install -y protobuf-compiler
# or
cd /opt
PB_REL="https://github.com/protocolbuffers/protobuf/releases"
curl -LO $PB_REL/download/v3.15.8/protoc-3.15.8-linux-x86_64.zip
unzip protoc-3.15.8-linux-x86_64.zip
sudo mv bin/protoc /usr/bin/protoc
sudo cp -r include/* /usr/include/
sudo rm -rf include bin readme.txt

wget https://github.com/grpc/grpc-web/releases/download/1.4.2/protoc-gen-grpc-web-1.4.2-linux-x86_64
sudo mv protoc-gen-grpc-web-1.4.2-linux-x86_64 /usr/bin/protoc-gen-grpc-web
sudo chmod +x /usr/bin/protoc-gen-grpc-web
```
### node npm nvm
> nodejs 16
```
wget -qO- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.3/install.sh | bash
nvm -v
nvm install 16
npm install -g npm@9.2.0
npm -v
node -v

```

## Backend server
* please note `server/src/main/resources/application.properties`
* environment variables
```
POSTGRES_HOST=localhost
POSTGRES_PORT=5432
POSTGRES_DB=postgres
POSTGRES_USER=postgres
POSTGRES_PASSWORD=postgress
```
* build
```
cd server
./gradlew build
```
* run 
```
java -jar build/libs/server-0.0.1-SNAPSHOT.jar
```
## Frontend server
* gotchas
    * all react env vars should start with `REACT_APP_` otherwise will get ignored
* init
```
npm init react-app client -y
```
* build
```
npm run build
```
* run
```
npm start
```
## Useful
* [springboot initializr](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=3.0.1&packaging=jar&jvmVersion=19&groupId=personal.reminders&artifactId=server&name=server&description=Versions%20Ledger%20Backend&packageName=personal.reminders.server&dependencies=jdbc,postgresql,actuator)

* start the database
```
docker-compose up db -d
```
* stop the database
```
docker-compose down db
```
* reset the database
```
docker-compose down
docker volume rm project_pgdata
```
* connect to database
```
psql -h localhost -U postgres
```
* grpcurl
```
go install github.com/fullstorydev/grpcurl/cmd/grpcurl@latest
alias grpcurl='~/go/bin/grpcurl'
grpcurl --plaintext localhost:9090 list

grpcurl --plaintext localhost:9090 personal.reminders.server.proto.Greeter.SayHello

grpcurl --plaintext -d '{ "name": "asd"}' localhost:9090 personal.reminders.server.proto.Greeter.SayHello

# with tls
grpcurl -cacert=../local_tls/server.crt  -d '{"name": "asd"}'  localhost:9090 personal.reminders.server.proto.Greeter.SayHello

grpcurl -cacert=../local_tls/server.crt  -d '{"technology": "asd", "environment": "test_089", "assignee":"cat", "updater":"dog", "lastUpdated": "never"}' localhost:9090 personal.reminders.server.proto.Version.SetVersion
```
* generate selfsigned certs
```
cd local_tls
openssl req -x509 -nodes -subj "/CN=localhost" -addext "subjectAltName = DNS:localhost" -newkey rsa:4096 -sha256 -keyout server.key -out server.crt -days 3650
```
* js proto generate
```
cd client/src
mkdir -p generated
protoc -I ../../proto-common/src/main/proto/ --js_out=import_style=commonjs:generated --grpc-web_out=import_style=commonjs,mode=grpcwebtext:generated ../../proto-common/src/main/proto/*.proto
```