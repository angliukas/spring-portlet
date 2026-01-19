# Spring Portlet Portal (JSR-286)

This project is a Spring Framework **4.3.x** web application that renders any deployed
JSR-286 (Portlet 2.0) portlet on the home page. The home page accepts a `portlet` query
parameter and uses Apache Pluto to render the requested portlet.

## Requirements

- Java 8
- Maven 3.x
- A servlet container that supports portlets (for example, Apache Pluto-enabled Tomcat)

## Build

```bash
mvn clean package
```

## Run

1. Deploy the generated `spring-portlet.war` to a container that includes the Apache Pluto
   portal driver.
2. Open the home page and provide a portlet name.

Example URL:

```
http://localhost:8080/spring-portlet/?portlet=sample-portlet
```

The included `sample-portlet` is registered in `WEB-INF/portlet.xml` and renders by default
if no query parameter is supplied.
