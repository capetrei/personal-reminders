FROM spring-be-base:0.0.1 as build

WORKDIR /app/proto-common

COPY proto-common/src src
COPY proto-common/build.gradle build.gradle
RUN gradle clean build --no-daemon

WORKDIR /app/server
COPY server/src src
COPY server/build.gradle build.gradle
COPY server/settings.gradle settings.gradle
RUN gradle clean build --no-daemon


FROM openjdk:19
ENV VERSION="0.0.1-SNAPSHOT"
COPY config/local_tls /local_tls

WORKDIR /app
COPY --from=build /app/server/build/libs/server-${VERSION}.jar server.jar

ENTRYPOINT ["java", "-jar", "server.jar"]