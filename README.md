# Hotel Booking Management System
Full-stack end-to-end application in Angular 6 using Spring framework and H2-Database.
JPA is used with Hibernate for the persistence of data and perform CRUD operations and RESTful APIs are developed using Spring boot framework.


For Eureka:
http://localhost:9768

For Swagger:
http://localhost:port_no/swagger-ui.html

For the H2 database:
http://localhost:port_no/h2-console, update JDBC URL: jdbc:h2:mem:testdb and and leave the password field blank.

You'll see 3 tables: Registration, Login, Address

First, add dummy details in the address table and copy its key
Then add in the login table and make sure to give role admin and copy its key too
At last use both keys in the registration table and now you can use your admin credentials.

**Start microservices in order**
 - Eureka
 - User management
 - User update, User view
 - Hotel Management
 - Hotel update, Hotel view
 - Room update, Room view
 - Booking Management
 - Booking Update and Booking View
