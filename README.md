# kotlin-web-app-sample
http://ver-1-0.net/2017/02/12/kotlin-spring-boot/

# Database Confiuguration

src/main/resources/application.yml

change config according to your environment
```
spring:
  datasource:
    url:  jdbc:mysql://localhost/test
    username: root
    password: 
    driverClassName: com.mysql.jdbc.Driver
```


# How to Start

```
git clone https://github.com/version-1/kotlin-web-app-sample.git
cd kotlin-web-app-sample && gradle build
gradle bootRun
```
