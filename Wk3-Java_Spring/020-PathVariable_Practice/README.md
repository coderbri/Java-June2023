# 020 `@PathVariable` Practice

## Overview

In Spring Boot, path variables are used to extract data from the URL path of a request. The `@PathVariable` annotation is used to bind the value of a path variable to a method parameter in a Spring MVC controller.

### `@PathVariable` Annotation

- The `@PathVariable` annotation in Spring Boot is used to extract values from the URI path and bind them to method parameters in the controller.
- It is typically used when parts of the URL need to be used as input parameters for processing requests.
- Path variables are specified in the URL within curly braces `{}` and can be accessed using `@PathVariable` annotation in the controller method.

### Differences from `@RequestParam`

- `@PathVariable` is used to extract values from the URI path, while `@RequestParam` is used to extract values from the query parameters in the URL.
- Path variables are a part of the URL path itself, whereas request parameters are appended to the URL after a `?` and are in the form of `key=value` pairs.
- Path variables are used to represent resource identifiers or hierarchical data in the URL, while request parameters are used to pass additional information to the server.

## Logic of Provided Code

The provided Java Spring Boot code demonstrates the usage of `@PathVariable` annotation in a controller class named `MainController`.

- The controller class is mapped to the base path `/practice`.
- The `welcome()` method is mapped to the root path `/practice` and returns a welcome message.
- The `travel()` method is mapped to the path `/practice/travel/{city}`. It accepts a path variable named `city` and prints a congratulatory message indicating the city to which the user will travel.
- The `lotto()` method is mapped to the path `/practice/lotto/{number}`. It accepts a path variable named `number` representing a lottery number. Based on whether the number is even or odd, it returns a fortune message.

### Note:

- Error handling is not implemented in these routes, so accessing routes with missing path variables may result in a Whitelabel Error Page instead of custom error messages.


---
<p align="right">Completed: ２０２４年０４月１１日（木）</p>