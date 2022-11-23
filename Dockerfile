FROM ibm-semeru-runtimes:open-11.0.16.1_1-jre
COPY target/city.management-*.jar city.management.jar
ENTRYPOINT ["java","-jar","/city.management.jar"]