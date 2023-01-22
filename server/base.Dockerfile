FROM gradle:jdk19-alpine

RUN apk update && \
    # apk add protoc protobuf-dev gcompat
    apk add curl gcompat

WORKDIR /opt

# protoc
ENV PB_REL="https://github.com/protocolbuffers/protobuf/releases"
RUN curl -LO $PB_REL/download/v3.15.8/protoc-3.15.8-linux-x86_64.zip && \
    unzip protoc-3.15.8-linux-x86_64.zip && \
    mv bin/protoc /usr/bin/protoc && \
    cp -r include/* /usr/include/ && \
    rm -rf include bin readme.txt
