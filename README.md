# Retail Store Application
On a retail website, the following discounts apply:
1. If the user is an employee of the store, he gets a 30% discount
2. If the user is an affiliate of the store, he gets a 10% discount
3. If the user has been a customer for over 2 years, he gets a 5% discount.
4. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45
as a discount).
5. The percentage based discounts do not apply on groceries.
6. A user can get only one of the percentage based discounts on a bill.

## Requirements:
Apache Maven
Java 8
Mysql 

## Application Architecture & Technology Stack
This repository implements the following quality gates:

Core Implementation Spring Boot, Spring Data JPA, Core Java
Static code analysis using SonarQube (TODO)
Unit testing: using JUnit, mocking using JMockit and Mockito

## Below is a list of Maven plugins used:
spring-boot-maven-plugin
mysql-connector-java
spring-boot-maven-plugin
spring-boot-starter-test
spring-boot-starter-data-jpa

## Getting Started

## Install Database
run retail_store.sql dump

edit application.properties file and set database properties

## Clone and build the project

mvn clean install
	
## Test Application
mvn -Dtest=ShoppingApplicationTest test

## Direct Run
To direct run application you can run shared executable jar
retail.store-0.0.1-SNAPSHOT	


