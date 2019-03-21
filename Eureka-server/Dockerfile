FROM anapsix/alpine-java:8
MAINTAINER Reply
LABEL maintainer="a.mastropietro@reply.it"
RUN apk add --no-cache curl
RUN apk add --no-cache tzdata
RUN cp /usr/share/zoneinfo/Europe/Rome /etc/localtime
RUN echo "Europe/Rome" > /etc/timezone
RUN apk del --no-cache tzdata
RUN mkdir /opt/eurekaserver
COPY target/com-self-sprintboot-learning-eureka-0.0.1-SNAPSHOT.jar /opt/eurekaserver/
WORKDIR  /opt/eurekaserver/
CMD /opt/jdk/jre/bin/java -Xms${javaMemory:-128}m -Xmx${javaMemory:-128}m -jar /opt/eurekaserver/com-self-sprintboot-learning-eureka-0.0.1-SNAPSHOT.jar

