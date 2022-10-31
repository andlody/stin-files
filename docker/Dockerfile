FROM openjdk:11.0-jdk
ENV TZ=America/Lima
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
COPY build/libs/{{api-name}}-0.0.1-SNAPSHOT.jar {{api-name}}.jar
EXPOSE 8080
CMD java -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar {{api-name}}.jar
