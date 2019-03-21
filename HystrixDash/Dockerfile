FROM anapsix/alpine-java:8
MAINTAINER Reply
LABEL maintainer="a.mastropietro@reply.it"
RUN apk add --no-cache curl
RUN apk add --no-cache tzdata
RUN cp /usr/share/zoneinfo/Europe/Rome /etc/localtime
RUN echo "Europe/Rome" > /etc/timezone
RUN apk del --no-cache tzdata
RUN mkdir /opt/hystrixDash
COPY target/HystrixDash-0.0.1-SNAPSHOT.jar /opt/hystrixDash/
WORKDIR  /opt/hystrixDash/
CMD /opt/jdk/jre/bin/java -Xms${javaMemory:-128}m -Xmx${javaMemory:-128}m -jar /opt/hystrixDash/HystrixDash-0.0.1-SNAPSHOT.jar

