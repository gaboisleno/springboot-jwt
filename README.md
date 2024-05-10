## Liquibase Installation

Add Liquibase dependency

```xml
    <dependency>
        <groupId>org.liquibase</groupId>
        <artifactId>liquibase-core</artifactId>
    </dependency>
```

In the pom.xml add liquibase master file location

```bash
spring.liquibase.change-log=classpath:/liquibase/master.xml
```

> Create directory `/resources/liquibase/changelog`
> Create `master.xml` in `/resources/liquibase`

`master.xml` will read all files inside `/resources/liquibase/changelog`

```xml
<?xml version="1.0" encoding="utf-8"?>
<databaseChangeLog
    xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-4.6.xsd">
     <includeAll path="/liquibase/changelog/"/>
</databaseChangeLog>
```

Finally add one initial migration to avoid failure on springboot:run.
If you preffer you can add manually one by one migration in the master.xml file changing the includeAll tag for

```xml
<include file="path/to/file">
```

## H2 Installation

Add H2 dependency

```xml
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
```

In the pom.xml add h2 configuration for conection and local file

```bash
spring.datasource.url=jdbc:h2:file:./src/main/resources/data/h2database
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

## JWT Installation

TO-DO

## Endpoints

`POST` `http://localhost:8080/api/auth/register`

```json
{
  "username": "admin",
  "password": "admin"
}
```

Response

```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJwZXBlIiwiY3VzdG9tQ2xhaW0iOiJteUN1c3RvbUNsYWltIiwiaWF0IjoxNzE1MzUzMjA5LCJleHAiOjE3MTUzNTQ2NDl9.blbV_Q9tj73KobGYd9iKsiZEI0ZKEwL7t_cUiYDpo6M"
}
```

`POST` `http://localhost:8080/api/auth/login`

```json
{
  "username": "admin",
  "password": "admin"
}
```

Response

```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJwZXBlIiwiY3VzdG9tQ2xhaW0iOiJteUN1c3RvbUNsYWltIiwiaWF0IjoxNzE1MzUzMjA5LCJleHAiOjE3MTUzNTQ2NDl9.blbV_Q9tj73KobGYd9iKsiZEI0ZKEwL7t_cUiYDpo6M"
}
```
