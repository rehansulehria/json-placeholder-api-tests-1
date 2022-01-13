# Json PlaceHolder API Tests

This repo contains API tests for [JSON PlaceHolder API](https://jsonplaceholder.typicode.com) 
written in RestAssured and Java

* [Required Software](#required-software)
* [How to execute the tests](#how-to-execute-the-tests)
* [Generating the test report](#generating-the-test-report)
* [About the Project Structure](#about-the-project-structure)
* [Libraries](#libraries)
* [Patterns applied](#patterns-applied)
* [Pipeline](#pipeline)

## Required software

* Java JDK 11+
* Maven installed and in your classpath. Please follow this guide to install maven if its not already installed
  [Maven Installation](https://maven.apache.org/install.html)
* Lombok
* Cucumber


## How to execute the tests
You can open each test class on `src\test\java\com.jsonplaceholder.steps` and execute all of them, but I recommend you run it by the
command line. It enables us to run in different test execution strategies and, also in a pipeline using command 

`mvn clean test`

## Libraries
* [RestAssured](http://rest-assured.io/) library to test REST APIs
* [TestNG]() to support the test creation
* [Lombok](https://projectlombok.org/setup/maven)  
* [Allure Report](https://docs.qameta.io/allure/) as the testing report strategy

## Patterns applied
* POJO Classes with Builder Pattern
* Request and Response Specification
* Test Classes with Run Using TestNG

## Pipeline
This task uses [CircleCI](https://circleci.com/) to run the all the tests in a pipeline.

## Generating the test report

This task uses Allure Report to automatically generate the test report. There are some configuration to make it happen:

aspectj configuration on pom.xml file
allure.properties file on src/test/resources
You can use the command line to generate it in two ways:

`mvn allure:serve`: will open the HTML report into the browser
`mvn allure:report`: will generate the HTML port at target/site/allure-maven-plugin folder
