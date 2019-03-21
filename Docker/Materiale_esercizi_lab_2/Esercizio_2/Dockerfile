FROM anapsix/alpine-java:8
RUN mkdir /opt/ms-bootcamp
COPY test.bootcamp.artifact-0.0.1-SNAPSHOT.jar /opt/bootcamp/
WORKDIR  /opt/bootcamp/
CMD /opt/jdk/jre/bin/java -Xms${javaMemory:-64}m -Xmx${javaMemory:-64}m -jar /opt/bootcamp/test.bootcamp.artifact-0.0.1-SNAPSHOT.jar