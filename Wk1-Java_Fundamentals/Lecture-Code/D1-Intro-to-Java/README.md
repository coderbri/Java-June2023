# D1: Intro to Java // Fundamentals Part I

<div style="display: flex; justify-content: space-between;">
    <p>Week 1 Session 1</p>
    <p>２０２４年０１月２３日（火）</p>
</div>

- what is a jdk?
- what is jvm?
- java concepts
    <!-- - camelCase is used to name files -->
    - PascalCase is used to name files and classes
    - how to initlialize a class?
        - every java class needs an entry point method to start the app.
        ```java
        public static void main( String[] args ) {}
        ```
    
    - compile code with command:
        ```bash
        javac <FileName.java>
        ```
    - the code will be compiled into ByteCode, the machine code, and a `.class` file will be made in the directory. The java file needs to be compiled after each change before running/testing.
    - when ready to test, run the command:
        ```bash
        java FileName
        ```
    
    - datatypes need to be declared before the variable, then the variable name and the value for that datatype.
        - strings are always defined by double quotes ("")
        - long vs int
            - long is used to reserve memory when numbers can become huge! int is safe to use if the number is fairly small
    
    - what is a wrapper class?