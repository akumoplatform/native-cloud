FROM openjdk:13 AS customer

ADD ./target/customer.jar /app/

CMD ["java", "-Dspring.profiles.active=prod", "-jar", "/app/customer.jar"]

#EXPOSE 8888