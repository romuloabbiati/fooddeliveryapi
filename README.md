# Project Name: AlgaFood-api
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/romuloabbiati/dsmeta/blob/main/LICENSE) 

# algafood-api
REST API of a food delivery like app named AlgaFood-api developed using Spring Boot using best market practices. This app was created when I took the course Spring REST Specialist taught by AlgaWorks.

In this course started off from the basics like CRUDS, and gone much further, with advanced topics like: Security (JWT Oauth2), file uploads, sending emails, caches, HATEOAS, documentation with Swagger, integration tests, projections with JPA, DDD , Domain Events, Oauth2 for security, database migration and versioning (Flyway), and much more!

## Developed with
* [Spring Framework](https://spring.io/projects/spring-framework)
* [Spring Data](https://spring.io/projects/spring-data)
* [Spring Security](https://spring.io/projects/spring-security)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [MySQL](https://www.mysql.com/)
* [Lombok](https://projectlombok.org/)
* [Flyway](https://flywaydb.org/)
* [ModelMapper](http://modelmapper.org/)
* [Jasper Reports](https://community.jaspersoft.com/)
* [AWS JDK S3](https://docs.aws.amazon.com/sdk-for-java/index.html)

## Running the app locally
### Pre-requisites
- ⚫ [Git](https://git-scm.com/)
- 🐋 [Docker](https://docs.docker.com/engine/install/)
- ☕ [Java 17 or superior](https://openjdk.org/projects/jdk/)
    - Suggestion: make use of SDKMan to install Java:
        - [SDKMan installation](https://sdkman.io/install)
        - [Java installation using SDKMan](https://sdkman.io/usage)

### Instructions

1. Clone the repository
   ```sh
   git clone https://github.com/romuloabbiati/fooddeliveryapi
   ```
2. Open it in your favourite IDE
3. Run the development environment with Docker
   ```sh
   docker-compose up -d
   ```
4. Run the app on your IDE
    - Run the main method [AlgafoodApiApplication](./src/main/java/com/algaworks/algafood/AlgafoodApiApplication.java)

### UML
![alt Project's UML](./doc/ESR%20-%20Diagrama%20de%20classes.png)
