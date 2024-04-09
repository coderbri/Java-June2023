# 019 Hello Human (`@RequestParam` Practice)

## Overview

This is a simple project demonstrating the usage of the `@RequestParam` annotation in Java Spring Boot projects. The project consists of a RESTful API that handles greeting messages based on user input parameters, such as name and number of repetitions. The objective is to showcase how the `@RequestParam` annotation can be used to handle request parameters in Spring Boot applications.

## Functionality

The project includes three main endpoints:

1. **Standard Greeting**: 
   - Endpoint: `/`
   - Example Usage: `localhost:8080/`
   - Returns the simple greeting message: "Hello Human".

2. **Greet by Name**: 
   - Endpoint: `/hello`
   - Example Usage: `localhost:8080/hello?name=John`
   - Returns a personalized greeting message based on the provided name, or a generic message if no name is provided.

3. **Greet by Full Name**:
   - Endpoint: `/hello/full_name`
   - Example Usage: `localhost:8080/hello/full_name?first_name=John&last_name=Doe`
   - Returns a personalized greeting message based on the provided first and last names, or prompts the user to provide a first or last name if one is missing.

4. **Repeat Greeting**:
   - Endpoint: `/hello/repeat`
   - Example Usage: `localhost:8080/hello/repeat?first_name=John&last_name=Doe&times=3`
   - Returns a repeated greeting message based on the provided first and last names, along with the number of times to repeat the greeting.


## Usage of @RequestParam Annotation

The `@RequestParam` annotation is used in the controller methods to handle request parameters. It allows us to retrieve parameter values from the request URL and pass them as arguments to the controller methods. In this project, we use `@RequestParam` to extract parameters such as name, first name, last name, and times from the request URLs.

Example:
```java
@RequestMapping("/hello")
public String helloName(@RequestParam(value="name", required=false) String name) {
    // Method logic
}
```

In this example, the `@RequestParam` annotation is used to extract the `name` parameter from the request URL. The `value` attribute specifies the name of the parameter, and the `required` attribute indicates whether the parameter is mandatory or not.

---
<p align="right">Completed: ２０２４年０４月０９日（火）</p>