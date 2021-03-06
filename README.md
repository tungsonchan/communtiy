## 问答社区-Spring Boot学习

## 部署

### 依赖

- Git
- JDK
- Maven
- MySQL

## 步骤

- yum update
- yum install git
- mkdir App
- cd App/
- git clone https://github.com/tungsonchan/communtiy.git
- yum install maven
- mvn -v
-  mvn compile package
-  cp src/main/resources/application.properties src/main/resources/application-production.properties
- vim src/main/resources/application-production.properties
- mvn package
- java -jar -Dspring.profiles.active=production target/community-0.0.1-SNAPSHOT.jar
- ps -aux | grep java
-  mvn clean compile flyway:migrate



## 资料

[Spring 文档](https://spring.io/guides)

[Spring MVC reference](https://docs.spring.io/spring/docs/5.2.3.RELEASE/spring-framework-reference/web.html#spring-web)

[es网站](https://elasticsearch.cn/explore)

[Bootstrap](https://v3.bootcss.com/)

[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

[Spring Boot Features](https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/html/spring-boot-features.html#boot-features-sql)

[mvnrepository](https://mvnrepository.com/)

[thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)

[postman]( https://chrome.google.com/webstore/search/postman?utm_source=chrome-ntp-icon )

[json editor online](http://jsoneditoronline.org/)

[Markdown插件]( https://pandao.github.io/editor.md/ )

[UFile SDK](https://github.com/ucloud/ufile-sdk-java)

## 工具

[Git](https://git-scm.com/download)

[VP](https://www.visual-paradigm.com)

[mybatis-spring-boot-autoconfigure](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)

[flyway](https://flywaydb.org/getstarted/firststeps/maven)

[Lombok](https://projectlombok.org/)

[Iconfont](https://www.iconfont.cn/)


## 脚本

```bash
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```
