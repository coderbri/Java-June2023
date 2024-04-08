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