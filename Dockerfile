FROM java:8
LABEL name="Hakim"
LABEL email="hakim.ansari@lntinfotech.com"
EXPOSE 1002
ADD /target/hsbc-electronics-mgmt-0.0.1-SNAPSHOT.jar hsbc-electronics-mgmt.jar
ENTRYPOINT ["java","-jar","hsbc-electronics-mgmt.jar"]