# Akumos Native-Cloud

Here we've a simple example of a Native-Cloud solution implemented using Spring-boot NetFlix and Spring-boot Cloud.<br>
This project is used on Akumo's Platform Tutorial, see here.
 
## Running and test

We recommend you follow the order of execution as it is presented bellow;
<p>
All commands should be execute from <i><project-root-directory></i>
</p>


### Config


````bash
cd /config
mvn clean install -DskipTests
java -jar ./target/config.jar
````
### Registry

````bash
cd /registry
mvn clean install -DskipTests
java -jar -Dspring.profiles.active=dev ./target/registry.jar
````
### Gateway

````bash
cd /gateway
mvn clean install -DskipTests
java -jar -Dspring.profiles.active=dev ./target/gateway.jar
````

### Customer mock

````bash
cd /customer
mvn clean install -DskipTests
java -jar -Dspring.profiles.active=dev ./target/customer.jar
````

### Testing with CURL

Mocking the get customers:

````bash
curl -X GET http://localhost:8089/api/customer/v1
````
