# Setting up views in Java Spring.

From this point, views will be introduced to Spring which will require different annotations in the controller and additional dependencies to the Spring Boot project so views can be rendered to the page. For transferring data from the backend to the frontend, JSTL tags will be utilized.

## Back-End Setup

### pom.xml

The following dependencies are required in the project's **pom.xml**:
```xml
<dependencies>
	<dependency>
		<groupId>org.apache.tomcat.embed</groupId>
		<artifactId>tomcat-embed-jasper</artifactId>
	</dependency>
	<dependency>
		<groupId>jakarta.servlet.jsp.jstl</groupId>
		<artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
	</dependency>
	<dependency>
		<groupId>org.glassfish.web</groupId>
		<artifactId>jakarta.servlet.jsp.jstl</artifactId>
	</dependency>
</dependencies>
```

### application.properties

As well as this configuration in the **application.properties** in the project's resources directory:

```coffeescript
spring.mvc.view.prefix=/WEB-INF/
```

## Front-End Setup

### index.jsp

Finally, this JSTL tag link needs to be embedded at the top of a JSP file:

```jsp
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
```

## Projects Where Concept is Introduced

For reference, this concept is introduced in the following projects:
- D8
- 021 Hopper's Receipt