#
# Download stage
#
FROM alpine/git as git
WORKDIR /app
RUN git clone https://github.com/breno500as/sca-util.git

#
# Build stage
#
FROM maven:3.5-jdk-8-alpine as builder
RUN mkdir /build
COPY --from=git /app/sca-util /build
WORKDIR /build
RUN mvn clean package
 
#
# Package stage
#
FROM openjdk:8-jdk-alpine as runtime
RUN mkdir /app
COPY --from=builder /build/target/sca-util-exec.jar app.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar" ]