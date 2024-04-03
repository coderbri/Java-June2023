# D8: Java Spring, Part II - Building the Front End

<div style="display: flex; justify-content: space-between;">
    <p>Week ３ Session ２</p>
    <p>２０２４年０３月０７日（木）</p>
</div>

### Table of Contents


## Setting up Java Server Pages

1. 


## Dynaming Rendering
<!-- In short:
    1. Create teh `src/main/webapp` folder if it does not exist.
    2. Create teh `src/main/webapp/WEB-INF` folder.
    3. Edit the `src/main/resources/application.properties` file to contain the following:
     ```
    spring.mvc.view.prefix-/WEB-INF/
    ```
-->
1. go to the directory that just says **src/**. Within it we access **main/webapp**, but instead of using the webapp directory we'll need to create a folder called **WEB-INF** because [ explain why this is better... ]
    <!-- possibly for deployment reasons -->
    This directory will live within the webapp folder. therefore the path in which JSP files will be created will be in the **src/main/webapp/WEB-INF**.

2. now we'll need to go to the **application.properties** file which resides in this path: **src/main/resources/templates**. There will most likely be nothing in it but this is where we would put the following:
    ```
    spring.mvc.view.prefix-/WEB-INF/
    ```


## Creating a JSP File
1. within the WEB-INF folder, right-click to create **New > Other > Web > JSP File**. Then name the file. To be able to see the settings to create a JSP file, the sts extension, **Eclipse Enterprise Java and Web Developer Tools** needs to be installed.

2. Click Next.

3. This is the Select JSP Template screen where we can preview the JSP file's layout before creation. We can create our own with the necessary JSTL tags and HTML setup by clicking the JSP Templates link at the bottom. There we can create new templates or edit existing ones.

4. After selecting a template, click Finish.

5. To avoid having an error that tends to appear at the beginning of a JSP file, resolve it by right-clicking on the projct folder **Properties > Project Facets**.
    There change the **Dynamic Web Module** from 2.5 to **5.0**. That's it! Now **Apply & Close**.

Notes:
- to comment out in JSP files, use the command: Command ⌘ + Shift ⇧ + C.

