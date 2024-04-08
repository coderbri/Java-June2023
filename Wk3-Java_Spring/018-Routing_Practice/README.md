# 018 Routing Practice

### Synopsis

This project demonstrates the usage of Spring Framework's `@RequestMapping` annotation to navigate between different routes based on the URL paths entered in the browser to deliver Bible texts.

## **Controller**

The **MainController** class is a REST controller responsible for handling incoming HTTP requests and returning the appropriate responses.


## Routes

### Welcome Route

- **Path**: [/routes](#)
- **Method**: `GET`
- **Description**: This route is the default route that welcomes the user.
- **Response**: "Welcome!"


### Today's Text Route

- **Path**: [/routes/today](#)
- **Method**: `GET`
- **Description**: This route returns the Bible text for the current day.
- **Response**: "So never be anxious about the next day, for the next day will have its own anxieties. Each day has enough of its own troubles".—Matthew 6:34


### Tomorrow's Text Route

- **Path**: [/routes/tomorrow](#)
- **Method**: `GET`
- **Description**: This route returns the Bible text for the following day.
- **Response**: ""And he will wipe out every tear from their eyes, and death will be no more, neither will mourning nor outcry nor pain be anymore. The former things have passed away."—Revelation 21:4"

---
<p align="right">Completed: ２０２４年０４月０８日（月）</p>