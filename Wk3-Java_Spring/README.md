# Week 3: Java Spring

２０２４年０３月０７日（木）ー ２０２４年０３月＿日（＿）

## Topics Covered

### [D7: Intro to Java Spring](Lecture-Code/D7-Spring_Intro/)
- Start a New Spring Boot Project
- Annotations and Routing with `@RestController`
- Query Parameters
- URLs `＠PathVariables`, * `@RequestParam`

### [D8: Java Spring Views](Lecture-Code/D8-Spring_Views/)
- Java Server Pages (JSPs)
- JSTL Tags
- Rendering with `＠Controller`
- Adding Static Content (CSS & JS)
- Implementing Bootstrap Styling
- JSTL Loops

### [D9: Java Spring Methods, Session & Forms](Lecture-Code/D9-Spring-Methods-Forms-Session/)
- Session (in Java)
- Form Submission
- GET vs POST
    - POST & Rendering
- Flash Data
- Dependency Injection


## Projects

### [018 Routing Practice](018-Routing_Practice/)

The **018 Routing Practice** project illustrates the usage of Spring Framework's `@RequestMapping` annotation for managing routes to deliver Bible texts. The **MainController** class acts as a REST controller, handling HTTP requests and generating responses. Three routes are defined: [/routes] for welcoming users, [/routes/today] for today's Bible text, and [/routes/tomorrow] for tomorrow's text, each providing the specified response.


### [019 Hello Human (`@RequestParam` Practice)](019-Hello_Human/)

The **019 Hello Human** project demonstrates building a RESTful API in Java with Spring Boot. It provides endpoints for greeting messages based on user input parameters like name and repetition count. Using the `@RequestParam` annotation, it handles parameter extraction from request URLs. The project includes endpoints for greeting by name, full name, and repeated greeting, showcasing parameter handling and endpoint design.

### [020 `@PathVariable` Practice](020-PathVariable_Practice/)

The **020 `PathVariable` Practice** Java Spring Boot project serves as a practice exercise for utilizing path variables in Spring MVC controllers to better understand dynamic routing and parameter extraction. It includes routes for welcoming users, simulating travel plans based on specified cities, and generating fortune messages based on provided lottery numbers.

<!-- ### 021 Hopper's Receipt -->
<!-- ### 022 Display Date  -->
<!-- ### 023 Fruity Loops  -->
<!-- ### 024 Counter  -->