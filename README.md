# SpringBoot-MyBatis-Hibernate-React
Spring Boot with MyBatis and Hibernate and also React demo.

*Overview*

This demo demonstrates a CRUD example using React as frontend UI and Spring Boot as the backend.

This project show you how to use MyBatis and Hibernate to connect to H2, MySQL and SQL Server database.

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

*Startup*

To run this application, we need two steps

1. run MyApplication.java as the backend
2. open a command line and navigate to 'test-react' folder, then input 'npm start'. it will open a broswer to access http://localhost:3000/


Email: freesky_zh@hotmail.com
