# D8: Java Spring: Views, Part II - Building the Front End

<div style="display: flex; justify-content: space-between;">
    <p>Week ３ Session ２</p>
    <p>２０２４年０３月０７日（木）</p>
</div>

This repository contains the follow-along code for an introductory lecture on Java Spring Views. The lecture covers various aspects of setting up and rendering JavaServer Pages (JSPs), resolving common errors, using Java Server Pages Standard Tag Library (JSTL) tags, and integrating static content and Bootstrap for styling.

## Table of Contents
- [1. Rendering JSP](#1-rendering-jsp)
    - [Resolving Common Errors Within JSP Files](#resolving-common-errors-within-jsp-files)
    - [Installing the Emmet Tool](#installing-the-emmet-tool)
- [2. About JSTL Tags](#2-about-jstl-tags)
- [3. Adding Static Content + Bootstrap](#3-adding-static-content--bootstrap)

**Note:** Further details on each main section can be found by following the linked titles.

## 1. [Rendering JSP](./notes/1-Rendering-JSP.md)
To render JSP files in a Java Spring project, follow these steps:
- Install necessary tools in Eclipse.
- Add dependencies in the `pom.xml` file.
- Create JSP files in the appropriate directory (`src/main/webapp/WEB-INF/`).
- Configure `application.properties` file.
- Use the `@Controller` annotation for rendering views.

### Resolving Common Errors Within JSP Files
Handle common errors related to JSP setup by adjusting project facets and configurations.

### Installing the Emmet Tool
Install and configure the Emmet plugin for HTML/XML coding to enhance productivity.

## 2. [About JSTL Tags](./notes/2-About-JSTL-Tags.md)
Learn about JSP Standard Tag Library (JSTL) and its usage for dynamic population of templates:
- Setup dependencies in the `pom.xml` file.
- Use `c:out` tag for dynamic data insertion.
- Utilize `forEach` tag for iterating over collections.
- Pass data to views using the `Model` object and understand dependency injection.

## 3. [Adding Static Content + Bootstrap](./notes/3-Adding-Static-Files.md)
Integrate static content and Bootstrap for styling:
- Organize static files in the project directory.
- Link external resources (CSS and JS files) in JSP.
- Integrate Bootstrap framework for enhanced styling.
