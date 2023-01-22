FROM node:16

WORKDIR /opt

# protoc
ENV PB_REL="https://github.com/protocolbuffers/protobuf/releases"
RUN curl -LO $PB_REL/download/v3.15.8/protoc-3.15.8-linux-x86_64.zip && \
    unzip protoc-3.15.8-linux-x86_64.zip && \
    mv bin/protoc /usr/bin/protoc && \
    cp -r include/* /usr/include/ && \
    rm -rf include bin readme.txt

# protoc web
RUN wget https://github.com/grpc/grpc-web/releases/download/1.4.2/protoc-gen-grpc-web-1.4.2-linux-x86_64 && \
    mv protoc-gen-grpc-web-1.4.2-linux-x86_64 /usr/bin/protoc-gen-grpc-web && \
    chmod +x /usr/bin/protoc-gen-grpc-web