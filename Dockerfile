FROM adoptopenjdk/openjdk11:alpine
RUN apk --no-cache add curl
COPY build/libs/*-all.jar myapp-kt.jar
CMD java ${JAVA_OPTS} -Dserver.port=$PORT -jar myapp-kt.jar