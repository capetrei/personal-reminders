FROM react-fe-base:0.0.1 as build

ARG REACT_APP_GRPC_BACKEND
ENV REACT_APP_GRPC_BACKEND=${REACT_APP_GRPC_BACKEND:-"http://localhost:8080"}

COPY proto-common/src/main/proto/ /proto-common

WORKDIR /app

COPY client/src src/
COPY client/public public/
COPY client/package.json client/package-lock.json ./

RUN rm src/generated/*
RUN protoc -I  /proto-common \
    --js_out=import_style=commonjs:src/generated \
    --grpc-web_out=import_style=commonjs,mode=grpcwebtext:src/generated \
    /proto-common/*.proto

RUN npm install && npm run build

FROM nginx:1.23.3-alpine

COPY --from=build /app/build /usr/share/nginx/html
RUN rm /etc/nginx/conf.d/default.conf
COPY config/nginx/nginx.conf /etc/nginx/conf.d
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]