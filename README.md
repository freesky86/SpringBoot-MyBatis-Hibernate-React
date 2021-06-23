# SpringBoot-MyBatis
Spring Boot with MyBatis and Hibernate

This project show you how to use MyBatis and Hibernate to connect to H2 database and MySQL database.

1.Hibernate use JpaRepository to access database.

2.MyBatis use Mapper to access database.

Note: When Spring Boot start, JPA will scan @Entity class to create table automatically. If there is Camel-Case field in entity(eg. firstName), the column name generated will use underline to seperate it(eg. first_name). For Hibernate, it works well. But for Mybatis, it still query Camel-Case column name, so it will return nul as there is no such column.

To solve this issue, we can add below item in application.properties.

    mybatis.configuration.mapUnderscoreToCamelCase=true
    Or
    mybatis.configuration.map-underscore-to-camel-case=true

The example URL

	http://localhost:8080/hibernate/users
	http://localhost:8080/mybatis/users

Email: freesky_zh@hotmail.com
